package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter42 extends AppCompatActivity {

    private CheckBox elec_b421;
    private CheckBox elec_b422;
    private CheckBox elec_b423;
    private CheckBox elec_b424;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter42);
        elec_b421 = (CheckBox) findViewById(R.id.elec_b421);
        elec_b422 = (CheckBox) findViewById(R.id.elec_b422);
        elec_b423 = (CheckBox) findViewById(R.id.elec_b423);
        elec_b424 = (CheckBox) findViewById(R.id.elec_b424);


        elec_b421.setOnClickListener(mCBCL);
        elec_b422.setOnClickListener(mCBCL);
        elec_b423.setOnClickListener(mCBCL);
        elec_b424.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b421:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b422:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b423:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b424:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}


