package com.ponyets.trifles;

import java.util.logging.Level;
import java.util.logging.Logger;

import android.content.Intent;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.api.client.http.HttpTransport;
import com.ponyets.trifles.fragment.BillListFragment;
import com.ponyets.trifles.model.UserModel;

public class BillListActivity extends SherlockFragmentActivity {
    private UserModel mUserModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_list);
        Logger.getLogger(HttpTransport.class.getName()).setLevel(Level.CONFIG);
        // GCMIntentService.register(this);
        mUserModel = UserModel.getInstance();
        if (mUserModel.isLogin()) {
            BillListFragment fragment = (BillListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.bill_list_fragment);
            fragment.updateData();
        } else {
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

    public void onRefresh(MenuItem item) {
        BillListFragment fragment = (BillListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.bill_list_fragment);
        fragment.updateData();
    }

    public void onAddBill(MenuItem item) {
        Intent intent = new Intent(this, AddBillActivity.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        case 0:
            if (resultCode == RESULT_OK) {
                BillListFragment fragment = (BillListFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.bill_list_fragment);
                fragment.updateData();
            } else {
                finish();
            }
            break;

        default:
            break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
