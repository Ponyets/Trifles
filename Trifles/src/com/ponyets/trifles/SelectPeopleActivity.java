package com.ponyets.trifles;

import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.appspot.api.services.peopleendpoint.model.People;
import com.appspot.api.services.peopleendpoint.model.Peoples;
import com.ponyets.trifles.model.UserModel;

public class SelectPeopleActivity extends SherlockFragmentActivity implements
        LoaderCallbacks<Peoples> {
    private ListView mListView;
    private ArrayAdapter<People> mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_people);
        mListView = (ListView) findViewById(android.R.id.list);
        mAdapter = new PeopleArrayAdapter(this,
                android.R.layout.simple_list_item_1);
        mListView.setAdapter(mAdapter);
        getSupportLoaderManager().initLoader(0, null, this);
        if (Build.VERSION.SDK_INT > 10) {
            mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        } else {
            mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE);
        }
        if (getIntent() != null) {
            if ("login".equals(getIntent().getStringExtra("type"))) {
                mListView.setChoiceMode(AbsListView.CHOICE_MODE_NONE);
                mListView.setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                            int position, long id) {
                        UserModel.getInstance().setWhoAmI(
                                mAdapter.getItem(position));
                        setResult(RESULT_OK);
                        finish();
                    }
                });
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        getSupportMenuInflater().inflate(R.menu.activity_select_people, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onAddPeople(MenuItem item) {
        Intent intent = new Intent(this, AddPeopleActivity.class);
        startActivityForResult(intent, 0);
    }

    public void onRefresh(MenuItem item) {
        getSupportLoaderManager().restartLoader(0, null, this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
            Intent intent) {
        if (resultCode == RESULT_OK) {
            People people = new People();
            people.setPeopleName(intent.getStringExtra("name"));
            people.setEmail(intent.getStringExtra("email"));
            new InsertPeopleTask().execute(new People[] { people });
        }
        super.onActivityResult(requestCode, resultCode, intent);
    }

    @Override
    public Loader<Peoples> onCreateLoader(int id, Bundle args) {
        return new PeopleLoader(this);
    }

    @Override
    public void onLoadFinished(Loader<Peoples> loader, Peoples data) {
        if (data == null) {
            return;
        }
        for (People people : data.getItems()) {
            mAdapter.add(people);
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoaderReset(Loader<Peoples> loader) {
        mListView.setAdapter(null);
    }

    private static class PeopleLoader extends AsyncTaskLoader<Peoples> {
        private Peoples mPeoples;

        public PeopleLoader(Context context) {
            super(context);
        }

        @Override
        public Peoples loadInBackground() {
            try {
                mPeoples = Endpoints.PEOPLE_ENDPOINT.listPeople().execute();
                return mPeoples;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onStartLoading() {
            if (mPeoples == null) {
                forceLoad();
            } else {
                deliverResult(mPeoples);
            }
        }
    }

    private class InsertPeopleTask extends AsyncTask<People, Integer, People> {

        @Override
        protected People doInBackground(People... params) {
            if (params.length > 0) {
                try {
                    return Endpoints.PEOPLE_ENDPOINT.insertPeople(params[0])
                            .execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(People result) {
            if (result != null) {
                mAdapter.add(result);
                mAdapter.notifyDataSetChanged();
            }
        }
    }

    private static class PeopleArrayAdapter extends ArrayAdapter<People> {
        private final int mResource;
        private final int mTextViewResourceId;
        private final LayoutInflater mInflater;

        public PeopleArrayAdapter(Context context, int resource,
                int textViewResourceId, List<People> objects) {
            super(context, resource, textViewResourceId, objects);
            mResource = resource;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        public PeopleArrayAdapter(Context context, int resource,
                int textViewResourceId, People[] objects) {
            super(context, resource, textViewResourceId, objects);
            mResource = resource;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        public PeopleArrayAdapter(Context context, int resource,
                int textViewResourceId) {
            super(context, resource, textViewResourceId);
            mResource = resource;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        public PeopleArrayAdapter(Context context, int textViewResourceId,
                List<People> objects) {
            super(context, textViewResourceId, objects);
            mResource = 0;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        public PeopleArrayAdapter(Context context, int textViewResourceId,
                People[] objects) {
            super(context, textViewResourceId, objects);
            mResource = 0;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        public PeopleArrayAdapter(Context context, int textViewResourceId) {
            super(context, textViewResourceId);
            mResource = 0;
            mTextViewResourceId = textViewResourceId;
            mInflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                if (mResource == 0) {
                    convertView = mInflater.inflate(mTextViewResourceId,
                            parent, false);
                    convertView.setTag(convertView);
                } else {
                    convertView = mInflater.inflate(mResource, parent, false);
                    convertView.setTag(convertView
                            .findViewById(mTextViewResourceId));
                }
            }
            People people = getItem(position);
            ((TextView) convertView.getTag()).setText(people.getPeopleName());
            return convertView;
        }

    }
}
