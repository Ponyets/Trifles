package com.ponyets.trifles;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class BillListActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_bill_list, menu);
        return true;
    }

    
}
