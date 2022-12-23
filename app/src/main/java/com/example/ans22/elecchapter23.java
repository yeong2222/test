package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter23 extends AppCompatActivity {
    private Button next_b23;
    private Button back_b23;
    private CheckBox elec_b231;
    private CheckBox elec_b232;
    private CheckBox elec_b233;
    private CheckBox elec_b234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter23);



        elec_b231 = (CheckBox) findViewById(R.id.elec_b231);
        elec_b232 = (CheckBox) findViewById(R.id.elec_b232);
        elec_b233 = (CheckBox) findViewById(R.id.elec_b233);
        elec_b234 = (CheckBox) findViewById(R.id.elec_b234);


        elec_b231.setOnClickListener(mCBCL);
        elec_b232.setOnClickListener(mCBCL);
        elec_b233.setOnClickListener(mCBCL);
        elec_b234.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b231:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b232:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b233:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b234:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
