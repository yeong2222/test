package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter21 extends AppCompatActivity {


    private Button next_b21;
    private CheckBox elec_b211;
    private CheckBox elec_b212;
    private CheckBox elec_b213;
    private CheckBox elec_b214;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter21);




        next_b21 = findViewById(R.id.next_b21);
        next_b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter21.this, elecchapter22.class);
                startActivity(intent);
            }
        });


        elec_b211 = (CheckBox) findViewById(R.id.elec_b211);
        elec_b212 = (CheckBox) findViewById(R.id.elec_b212);
        elec_b213 = (CheckBox) findViewById(R.id.elec_b213);
        elec_b214 = (CheckBox) findViewById(R.id.elec_b214);


        elec_b211.setOnClickListener(mCBCL);
        elec_b212.setOnClickListener(mCBCL);
        elec_b213.setOnClickListener(mCBCL);
        elec_b214.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b211:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b212:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b213:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b214:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

        };
    }









