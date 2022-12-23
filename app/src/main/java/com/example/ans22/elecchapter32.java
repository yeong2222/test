package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter32 extends AppCompatActivity {

    private Button next_b32;
    private Button back_b32;
    private CheckBox elec_b321;
    private CheckBox elec_b322;
    private CheckBox elec_b323;
    private CheckBox elec_b324;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter32);




        elec_b321 = (CheckBox) findViewById(R.id.elec_b321);
        elec_b322 = (CheckBox) findViewById(R.id.elec_b322);
        elec_b323 = (CheckBox) findViewById(R.id.elec_b323);
        elec_b324 = (CheckBox) findViewById(R.id.elec_b324);


        elec_b321.setOnClickListener(mCBCL);
        elec_b322.setOnClickListener(mCBCL);
        elec_b323.setOnClickListener(mCBCL);
        elec_b324.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b321:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b322:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b323:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b324:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
    }
}