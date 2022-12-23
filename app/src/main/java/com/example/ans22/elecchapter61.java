package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter61 extends AppCompatActivity {

    private Button next_b61;
    private CheckBox elec_b611;
    private CheckBox elec_b612;
    private CheckBox elec_b613;
    private CheckBox elec_b614;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter61);
        next_b61 = findViewById(R.id.next_b61);
        next_b61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter61.this, elecchapter62.class);
                startActivity(intent);
            }
        });




        elec_b611 = (CheckBox) findViewById(R.id.elec_b611);
        elec_b612 = (CheckBox) findViewById(R.id.elec_b612);
        elec_b613 = (CheckBox) findViewById(R.id.elec_b613);
        elec_b614 = (CheckBox) findViewById(R.id.elec_b614);


        elec_b611.setOnClickListener(mCBCL);
        elec_b612.setOnClickListener(mCBCL);
        elec_b613.setOnClickListener(mCBCL);
        elec_b614.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b611:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b612:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b613:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b614:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
