package com.arya.yokart_theshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    Button signin;
    EditText email, pass;
    TextView forgotpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signin = findViewById(R.id.btn_signin);
        email = findViewById(R.id.input_email);
        pass = findViewById(R.id.input_password);
        forgotpass = findViewById(R.id.forgot_pass);
        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(email.getText().toString().length()==0 || pass.getText().toString().length()==0)
                {
                    Toast.makeText(SignIn.this, "Please fill the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(SignIn.this, Home.class);
                    startActivity(intent);
                    finish();

                }
            }
        });
    }
}