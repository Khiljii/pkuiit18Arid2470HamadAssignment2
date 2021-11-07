package com.example.pkuiit18_arid_2470_hamadassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText etName,etEmail,etPass;
    Button btnSubmit;
    RadioButton rdMale,rdFemale;
    CheckBox checkbox1,checkbox2,checkbox3;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initialize();
        performaction();
    }

    private void performaction() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=etEmail.getText().toString();
                String gender;
                if(rdMale.isChecked())
                {
                    gender="Male";
                }
                else
                {
                    gender="female";
                }
                String subject = null;
                if (checkbox1.isChecked()){
                    subject="App";
                }
                if (checkbox2.isChecked()){
                    subject= subject +"Unix";
                }
                if (checkbox3.isChecked()){
                    subject=subject+"PF";
                }
                long user_data = databaseHelper.signup(etName.getText().toString(), etEmail.getText().toString(), etPass.getText().toString(),gender,subject);

                if (user_data == -1) {
                    Toast.makeText(Signup.this, "Error", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(Signup.this, Login.class));

                }


            }
        });
    }

    private void initialize() {
        databaseHelper =new DatabaseHelper(this);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etName = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);
        btnSubmit= (Button) findViewById(R.id.btnSubmit);
        checkbox1=(CheckBox) findViewById(R.id.checkbox1);
        checkbox2=(CheckBox) findViewById(R.id.checkbox2);
        checkbox3=(CheckBox) findViewById(R.id.checkbox3);
        rdMale=(RadioButton) findViewById(R.id.rdMale);
        rdFemale=(RadioButton) findViewById(R.id.rdFemale);
    }
}