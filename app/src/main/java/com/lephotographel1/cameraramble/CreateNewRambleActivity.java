package com.lephotographel1.cameraramble;

import android.app.Activity;
import android.os.Bundle;
import android.app.ActionBar;


public class CreateNewRambleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_ramble);
        //
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
