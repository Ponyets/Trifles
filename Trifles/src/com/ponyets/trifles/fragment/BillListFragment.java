package com.ponyets.trifles.fragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.actionbarsherlock.app.SherlockListFragment;
import com.appspot.api.services.billendpoint.model.Bill;
import com.appspot.api.services.billendpoint.model.BillRecord;
import com.appspot.api.services.billendpoint.model.Bills;
import com.ponyets.trifles.Endpoints;

public class BillListFragment extends SherlockListFragment implements
        LoaderCallbacks<Bills> {

    public void updateData() {
        getLoaderManager().restartLoader(0, null, this);
    }

    private static class BillLoader extends AsyncTaskLoader<Bills> {
        private Bills mBills;

        public BillLoader(Context context) {
            super(context);
        }

        @Override
        public Bills loadInBackground() {
            try {
                mBills = Endpoints.BILL_ENDPOINT.listBill().execute();
                return mBills;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onStartLoading() {
            if (mBills == null) {
                forceLoad();
            } else {
                deliverResult(mBills);
            }
        }
    }

    @Override
    public Loader<Bills> onCreateLoader(int id, Bundle args) {
        BillLoader loader = new BillLoader(getActivity());
        return loader;
    }

    @Override
    public void onLoadFinished(Loader<Bills> loader, Bills data) {
        List<String> list = new ArrayList<String>();
        for (Bill bill : data.getItems()) {
            StringBuilder builder = new StringBuilder("Name\tPay\tShouldPay");
            for (BillRecord record : bill.getRecords()) {
                builder.append("\n").append(record.getPeople().getPeopleName())
                        .append("\t").append(record.getPay()).append("\t")
                        .append(record.getShouldPay());
            }
            list.add(builder.toString());
        }
        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);
    }

    @Override
    public void onLoaderReset(Loader<Bills> loader) {
        setListAdapter(null);
    }
}
