package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button elec;
    private Button elecq;
    private Button math;
    private Button mathq;
    private Button exam;


    //git hub test33

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        elec = findViewById(R.id.elec);
        elec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, elecchap.class);
                startActivity(intent);
            }
        });

        math = findViewById(R.id.math);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mathchap.class);
                startActivity(intent);
            }
        });


        elecq = findViewById(R.id.elecq);
        elecq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,elecquizchap.class);
                startActivity(intent);
            }
        });

        mathq = findViewById(R.id.mathq);
        mathq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mathquizchap.class);
                startActivity(intent);
            }
        });


        exam = findViewById(R.id.exam);
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TEST.class);
                startActivity(intent);
            }
        });



    }





}