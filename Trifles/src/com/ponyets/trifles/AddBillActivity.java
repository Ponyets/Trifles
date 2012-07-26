package com.ponyets.trifles;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.appspot.api.services.billendpoint.model.BillRecord;
import com.ponyets.trifles.fragment.BillRecordListFragment;

public class AddBillActivity extends SherlockFragmentActivity {
    private EditText mDescription;
    private EditText mCost;
    private Button mDateTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_add_bill);
        mDescription = (EditText) findViewById(R.id.description);
        mCost = (EditText) findViewById(R.id.cost);
        mDateTextView = (Button) findViewById(R.id.date);
        Date date = new Date();
        mDateTextView.setText(DateFormat.format("yyyy-MM-dd", date));

        mCost.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                    int count) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                    int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                Fragment fragment = getSupportFragmentManager()
                        .findFragmentById(R.id.bill_list_fragment);
                ((BillRecordListFragment) fragment).setCost(Double.valueOf(s
                        .toString()));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_add_bill, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            finish();
            break;

        default:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onDateClick(View view) {
        new DateDialogFragment()
                .show(getSupportFragmentManager(), "datePicker");
    }

    public void onDatePicked(int year, int monthOfYear, int dayOfMonth) {
        mDateTextView.setText(String.format("%d-%2d-%2d", year,
                monthOfYear + 1, dayOfMonth));
    }

    public void onAccept(MenuItem item) {
        BillRecordListFragment fragment = (BillRecordListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.bill_record_list_fragment);
        List<BillRecord> billRecords = fragment.getBillRecords();
        Double cost = Double.valueOf(mCost.getText().toString());
        String description = mDescription.getText().toString();
        String date = String.valueOf(mDateTextView.getText());
    }

    public static class DateDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            Calendar calendar = Calendar.getInstance();
            return new DatePickerDialog(getActivity(), new OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year,
                        int monthOfYear, int dayOfMonth) {
                    ((AddBillActivity) getActivity()).onDatePicked(year,
                            monthOfYear, dayOfMonth);
                }
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH));
        }
    }

}
