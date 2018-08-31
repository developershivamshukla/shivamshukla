package com.arya.yokart_theshoppingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    public void onBackPressed() {
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }
}
