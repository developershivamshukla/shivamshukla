package com.arya.yokart_theshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    Button signup;
    EditText inputname,inputemail,inputpass,inputcpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        signup = findViewById(R.id.btn_signup);
        inputname = findViewById(R.id.input_name);
        inputemail = findViewById(R.id.input_email);
        inputpass = findViewById(R.id.input_password);
        inputcpass = findViewById(R.id.input_cpassword);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (inputname.getText().toString().length()==0 || inputemail.getText().toString().length()==0 || inputpass.getText().toString().length()==0 || inputcpass.getText().toString().length()==0)
                {
                    Toast.makeText(CreateAccount.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
                    if (inputpass.getText().toString()!=inputcpass.getText().toString())
                    {
                        Toast.makeText(CreateAccount.this, "Password does not match", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Intent intent=new Intent(CreateAccount.this,SignIn.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
