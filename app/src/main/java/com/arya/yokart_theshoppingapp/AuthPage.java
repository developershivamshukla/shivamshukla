package com.arya.yokart_theshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AuthPage extends AppCompatActivity {

    Button signin,create_account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_page);
        signin = findViewById(R.id.button_sigin);
        create_account = findViewById(R.id.button_create_account);
        create_account = findViewById(R.id.button_create_account);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuthPage.this,SignIn.class);
                startActivity(intent);
            }
        });
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AuthPage.this,CreateAccount.class);
                startActivity(intent);
            }
        });
    }
}
