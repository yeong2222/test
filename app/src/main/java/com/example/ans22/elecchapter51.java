package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter51 extends AppCompatActivity {

    private Button next_b51;
    private CheckBox elec_b511;
    private CheckBox elec_b512;
    private CheckBox elec_b513;
    private CheckBox elec_b514;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter51);
        next_b51 = findViewById(R.id.next_b51);
        next_b51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter51.this, elecchapter52.class);
                startActivity(intent);
            }
        });




        elec_b511 = (CheckBox) findViewById(R.id.elec_b511);
        elec_b512 = (CheckBox) findViewById(R.id.elec_b512);
        elec_b513 = (CheckBox) findViewById(R.id.elec_b513);
        elec_b514 = (CheckBox) findViewById(R.id.elec_b514);


        elec_b511.setOnClickListener(mCBCL);
        elec_b512.setOnClickListener(mCBCL);
        elec_b513.setOnClickListener(mCBCL);
        elec_b514.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b511:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b512:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b513:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b514:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
