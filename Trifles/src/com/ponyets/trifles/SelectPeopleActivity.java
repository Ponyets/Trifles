package com.ponyets.trifles;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockListActivity;

public class SelectPeopleActivity extends SherlockListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_people);
    }

    @Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_select_people, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
