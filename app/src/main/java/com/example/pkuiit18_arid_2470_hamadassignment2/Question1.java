package com.example.pkuiit18_arid_2470_hamadassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Question1 extends AppCompatActivity {
    Button back;
    ImageButton ibtn;
    ImageView image;
    EditText edit;
    TextView text;
    CheckBox box1,box2;
    RadioButton radio1,radio2;
    ToggleButton toggle;
    SeekBar seek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Initializar();
        performance();
    }

    private void performance() {
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ImageButton","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on ImageButton ", Toast.LENGTH_SHORT).show();
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("EditText","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on EditText ", Toast.LENGTH_SHORT).show();
            }
        });
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("TextView","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on TextView ", Toast.LENGTH_SHORT).show();
            }
        });
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("CheckBox1","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on CheckBox1 ", Toast.LENGTH_SHORT).show();
            }
        });
        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("CheckBox2","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on CheckBox2 ", Toast.LENGTH_SHORT).show();
            }
        });
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("RadioButton1","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on RadioButton1 ", Toast.LENGTH_SHORT).show();
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("RadioButton2","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on RadioButton2 ", Toast.LENGTH_SHORT).show();
            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("ToggleButton","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on ToggleButton ", Toast.LENGTH_SHORT).show();
            }
        });
        seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("SeekBar","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on SeekBar ", Toast.LENGTH_SHORT).show();
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("ImageView","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on ImageView ", Toast.LENGTH_SHORT).show();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Button","Being Clicked");
                Toast.makeText(Question1.this, "You Clicked on Button ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Initializar() {
        back=(Button) findViewById(R.id.btngoback);
        ibtn=(ImageButton) findViewById(R.id.ibtn);
        edit=(EditText) findViewById(R.id.edit);
        text=(TextView) findViewById(R.id.text);
        box1=(CheckBox) findViewById(R.id.box1);
        box2=(CheckBox) findViewById(R.id.box2);
        radio1=(RadioButton) findViewById(R.id.radio1);
        radio2=(RadioButton) findViewById(R.id.radio2);
        toggle=(ToggleButton) findViewById(R.id.toggle);
        seek=(SeekBar) findViewById(R.id.seekbar);
        image=(ImageView) findViewById(R.id.image);
    }
}