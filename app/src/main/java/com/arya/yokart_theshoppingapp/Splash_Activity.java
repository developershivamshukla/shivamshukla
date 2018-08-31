package com.arya.yokart_theshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        final Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                } finally {

                    Intent intent = new Intent(Splash_Activity.this,AuthPage.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        th.start();
    }
}
