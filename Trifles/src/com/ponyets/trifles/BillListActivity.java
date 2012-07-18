package com.ponyets.trifles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.AsyncTaskLoader;

import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.appspot.api.services.billendpoint.model.Bills;
import com.ponyets.trifles.model.UserModel;

public class BillListActivity extends SherlockListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!UserModel.getInstance().isLogin()) {
            Intent intent = new Intent(this, SelectPeopleActivity.class);
            intent.putExtra("type", "login");
            startActivityForResult(intent, 0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_bill_list, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        case 0:
            if (resultCode == RESULT_OK) {

            } else {
                finish();
            }
            break;

        default:
            break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private static class BillLoader extends AsyncTaskLoader<Bills> {

        public BillLoader(Context context) {
            super(context);
        }

        @Override
        public Bills loadInBackground() {
            return null;
        }

    }
}
