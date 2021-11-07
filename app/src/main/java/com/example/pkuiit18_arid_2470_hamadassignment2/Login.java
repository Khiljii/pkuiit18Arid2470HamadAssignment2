package com.example.pkuiit18_arid_2470_hamadassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnLogin;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializer();
        performance();
    }

    private void performance() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=etEmail.getText().toString();
                String pass=etPassword.getText().toString();
                Boolean check = databaseHelper.login(email,pass);
                if (check == true)
                {
                    startActivity(new Intent(Login.this, UserUI.class));
                }
                else{
                    Toast.makeText(Login.this, "Email Or Password Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void initializer() {
        databaseHelper =new DatabaseHelper(this);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }
}