package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter22 extends AppCompatActivity {

    private Button next_b22;
    private Button back_b22;
    private CheckBox elec_b221;
    private CheckBox elec_b222;
    private CheckBox elec_b223;
    private CheckBox elec_b224;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter22);

        next_b22 = findViewById(R.id.next_b22);
        next_b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter22.this, elecchapter23.class);
                startActivity(intent);
            }
        });

        back_b22 = findViewById(R.id.back_b22);
        back_b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter22.this,elecchapter21.class);
                startActivity(intent);
            }
        });


        elec_b221 = (CheckBox) findViewById(R.id.elec_b221);
        elec_b222 = (CheckBox) findViewById(R.id.elec_b222);
        elec_b223 = (CheckBox) findViewById(R.id.elec_b223);
        elec_b224 = (CheckBox) findViewById(R.id.elec_b224);


        elec_b221.setOnClickListener(mCBCL);
        elec_b222.setOnClickListener(mCBCL);
        elec_b223.setOnClickListener(mCBCL);
        elec_b224.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b221:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b222:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b223:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b224:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
    }
