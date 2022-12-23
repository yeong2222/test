package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class elecquizchap extends AppCompatActivity {

    private Button elecq1;
    private Button elecq2;
    private Button elecq3;
    private Button elecq4;
    private Button elecq5;
    private Button elecq6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecquizchap);

    elecq1 = findViewById(R.id.elecq1);
    elecq1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(elecquizchap.this, elecquiz1.class);
            startActivity(intent);
        }
    });

    elecq2 = findViewById(R.id.elecq2);
    elecq2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(elecquizchap.this, elecchapter21.class);
            startActivity(intent);
        }
    });
    elecq3 = findViewById(R.id.elecq3);
    elecq3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(elecquizchap.this,elecchapter31.class);
            startActivity(intent);



        }
    });
        elecq4 = findViewById(R.id.elecq4);
        elecq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecquizchap.this,elecchapter41.class);
                startActivity(intent);



            }
        });
        elecq5 = findViewById(R.id.elecq5);
        elecq5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecquizchap.this,elecchapter51.class);
                startActivity(intent);



            }
        });
        elecq6 = findViewById(R.id.elecq6);
        elecq6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecquizchap.this,elecchapter61.class);
                startActivity(intent);



            }
        });


    }


}