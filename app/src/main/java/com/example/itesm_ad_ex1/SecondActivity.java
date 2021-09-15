package com.example.itesm_ad_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public TextView myTextViewMgr;
    public Intent myIntent;
    public String myName;
    public int myAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myTextViewMgr = findViewById(R.id.textViewSecond);
        myIntent=getIntent();

        myName = myIntent.getStringExtra("nameExtra");
        myAge =myIntent.getIntExtra("ageExtra", 0);

        myTextViewMgr.setText("Hello "  + myName + ", and your age is " + String.valueOf(myAge));
    }
}