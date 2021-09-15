package com.example.itesm_ad_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView myImageView;
    TextView myTextView;
    EditText myEditText;
    Button myButton;
    Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = findViewById(R.id.imageView);
        myTextView = findViewById(R.id.textView);

        myEditText = findViewById(R.id.myEditTextView);
        myButton = findViewById(R.id.myButtonView);

        myButton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v){


              myIntent = new Intent(MainActivity.this, SecondActivity.class);
              myIntent.putExtra("nameExtra",myEditText.getText().toString());
              myIntent.putExtra("ageExtra", 40);

              startActivity(myIntent);
            /* if(myImageView.getVisibility()== View.VISIBLE){
                  myImageView.setVisibility(View.INVISIBLE);
              }
              else{
                  myImageView.setVisibility(View.VISIBLE);
              }
            */
            }


        }

        );

    }
}