package com.ponyets.trifles.fragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.appspot.api.services.billendpoint.model.BillRecord;
import com.appspot.api.services.peopleendpoint.model.People;
import com.ponyets.trifles.Endpoints;
import com.ponyets.trifles.R;
import com.ponyets.trifles.SelectPeopleActivity;

public class BillRecordListFragment extends SherlockListFragment {
    private BillRecord mPayRecord;
    private List<BillRecord> mBillRecordList;
    private Double mCost = 0d;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.add(0, R.id.menu_select_people, 1, R.string.menu_select_people)
                .setIcon(R.drawable.ic_action_select_people)
                .setShowAsActionFlags(MenuItem.SHOW_AS_ACTION_ALWAYS);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.menu_select_people:
            Intent intent = new Intent(getActivity(),
                    SelectPeopleActivity.class);
            intent.putExtra("type", "mutiselect");
            startActivityForResult(intent, 0);
            return true;

        default:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        case 0:
            if (resultCode == Activity.RESULT_OK) {
                ArrayList<String> list = data
                        .getStringArrayListExtra("selected");
                if (list != null && !list.isEmpty()) {
                    List<People> selectedPeopleList = new ArrayList<People>();
                    try {
                        for (String jsonString : list) {
                            People people = Endpoints.JSON_FACTORY.fromString(
                                    jsonString, People.class);
                            selectedPeopleList.add(people);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mBillRecordList = new ArrayList<BillRecord>();
                    for (People people : selectedPeopleList) {
                        BillRecord record = new BillRecord();
                        record.setPeople(people);
                        record.setPay(0d);
                        record.setShouldPay(0d);
                        mBillRecordList.add(record);
                    }
                    BillRecordAdapter adapter = new BillRecordAdapter(
                            getActivity(), mBillRecordList);
                    setListAdapter(adapter);
                    selectWhoPay();
                } else {
                    setListAdapter(null);
                }
            } else {
                setListAdapter(null);
            }
            break;

        default:
            break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void setCost(Double cost) {
        mCost = cost;
        computePay();
    }

    private void computePay() {
        if (mBillRecordList != null) {
            for (BillRecord record : mBillRecordList) {
                if (record.equals(mPayRecord)) {
                    record.setPay(mCost);
                }
                record.setShouldPay(mCost / mBillRecordList.size());
            }
            ((BaseAdapter) getListAdapter()).notifyDataSetChanged();
        }
    }

    private void selectWhoPay() {
        CharSequence[] peopleNames = new CharSequence[mBillRecordList.size()];
        for (int i = 0, n = peopleNames.length; i < n; i++) {
            peopleNames[i] = mBillRecordList.get(i).getPeople().getPeopleName();
        }
        new AlertDialog.Builder(getActivity())
                .setTitle(R.string.title_dialog_select_pay)
                .setItems(peopleNames, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mPayRecord = mBillRecordList.get(which);
                        computePay();
                    }
                }).show();
    }

    private static class BillRecordAdapter extends BaseAdapter {
        private List<BillRecord> mBillRecordList;
        private LayoutInflater mInflater;

        public BillRecordAdapter(Context context,
                List<BillRecord> billRecordList) {
            mBillRecordList = billRecordList;
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mBillRecordList.size();
        }

        @Override
        public BillRecord getItem(int position) {
            return mBillRecordList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Holder holder;
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.bill_record_list_item,
                        parent, false);
                holder = new Holder();
                holder.people = (TextView) convertView
                        .findViewById(R.id.people);
                holder.pay = (TextView) convertView.findViewById(R.id.pay);
                holder.shouldPay = (TextView) convertView
                        .findViewById(R.id.shouldpay);
                convertView.setTag(holder);
            } else {
                holder = (Holder) convertView.getTag();
            }
            BillRecord record = getItem(position);
            holder.people.setText(record.getPeople().getPeopleName());
            holder.pay.setText(String.valueOf(record.getPay()));
            holder.shouldPay.setText(String.valueOf(record.getShouldPay()));
            return convertView;
        }

        private static class Holder {
            TextView people, pay, shouldPay;
        }
    }

    public List<BillRecord> getBillRecords() {
        return mBillRecordList;
    }

}
