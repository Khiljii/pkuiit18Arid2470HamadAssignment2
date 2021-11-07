package com.example.pkuiit18_arid_2470_hamadassignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserUI extends AppCompatActivity {
    TextView name,arid,degree,section,father,email,phone;
    ImageView back,round;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_ui);
        initializer();
    }

    private void initializer() {
        name=(TextView) findViewById(R.id.name);
        arid=(TextView) findViewById(R.id.arid);
        degree=(TextView) findViewById(R.id.degree);
        section=(TextView) findViewById(R.id.section);
        father=(TextView) findViewById(R.id.fname);
        email=(TextView) findViewById(R.id.email);
        phone=(TextView) findViewById(R.id.phone);
        back=(ImageView) findViewById(R.id.back);

    }
}