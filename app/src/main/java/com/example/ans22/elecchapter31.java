package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter31 extends AppCompatActivity {

    private Button next_b31;
    private Button back_b31;
    private CheckBox elec_b311;
    private CheckBox elec_b312;
    private CheckBox elec_b313;
    private CheckBox elec_b314;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter31);

        next_b31 = findViewById(R.id.next_b31);
        next_b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter31.this, elecchapter32.class);
                startActivity(intent);
            }
        });




        elec_b311 = (CheckBox) findViewById(R.id.elec_b311);
        elec_b312 = (CheckBox) findViewById(R.id.elec_b312);
        elec_b313 = (CheckBox) findViewById(R.id.elec_b313);
        elec_b314 = (CheckBox) findViewById(R.id.elec_b314);


        elec_b311.setOnClickListener(mCBCL);
        elec_b312.setOnClickListener(mCBCL);
        elec_b313.setOnClickListener(mCBCL);
        elec_b314.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b311:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b312:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b313:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b314:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}


