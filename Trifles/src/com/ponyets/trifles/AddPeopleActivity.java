package com.ponyets.trifles;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class AddPeopleActivity extends SherlockFragmentActivity {
    private EditText mNameEditText;
    private EditText mEmailEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_people);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mNameEditText = (EditText) findViewById(R.id.name);
        mEmailEditText = (EditText) findViewById(R.id.email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_add_people, menu);
        return true;
    }

    public void onAccept(MenuItem item) {
        String name = mNameEditText.getText().toString();
        String email = mEmailEditText.getText().toString();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, R.string.toast_need_people_name,
                    Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent();
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            setResult(RESULT_OK, intent);
            finish();
        }
    }

    public void onCancel(MenuItem item) {
        setResult(RESULT_CANCELED);
        finish();
    }

}
