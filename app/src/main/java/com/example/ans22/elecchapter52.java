package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter52 extends AppCompatActivity {

    private CheckBox elec_b521;
    private CheckBox elec_b522;
    private CheckBox elec_b523;
    private CheckBox elec_b524;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter52);

        elec_b521 = (CheckBox) findViewById(R.id.elec_b521);
        elec_b522 = (CheckBox) findViewById(R.id.elec_b522);
        elec_b523 = (CheckBox) findViewById(R.id.elec_b523);
        elec_b524 = (CheckBox) findViewById(R.id.elec_b524);


        elec_b521.setOnClickListener(mCBCL);
        elec_b522.setOnClickListener(mCBCL);
        elec_b523.setOnClickListener(mCBCL);
        elec_b524.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b521:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b522:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b523:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b524:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}

