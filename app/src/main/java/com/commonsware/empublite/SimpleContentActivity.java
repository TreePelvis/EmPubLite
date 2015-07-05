package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SimpleContentActivity extends Activity {
    public static final String EXRTA_FILE = "file";
        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            if(getFragmentManager().findFragmentById(android.R.id.content) == null) {
                String file = getIntent().getStringExtra(EXRTA_FILE);
                Fragment f = SimpleContentFragment.newInstance(file);

                getFragmentManager().beginTransaction().add(android.R.id.content, f).commit();
            }
    }
}
