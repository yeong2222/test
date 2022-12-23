package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter41 extends AppCompatActivity {


    private Button next_b41;
    private Button back_b41;
    private CheckBox elec_b411;
    private CheckBox elec_b412;
    private CheckBox elec_b413;
    private CheckBox elec_b414;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter41);

        next_b41 = findViewById(R.id.next_b41);
        next_b41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(elecchapter41.this, elecchapter42.class);
                startActivity(intent);
            }
        });




        elec_b411 = (CheckBox) findViewById(R.id.elec_b411);
        elec_b412 = (CheckBox) findViewById(R.id.elec_b412);
        elec_b413 = (CheckBox) findViewById(R.id.elec_b413);
        elec_b414 = (CheckBox) findViewById(R.id.elec_b414);


        elec_b411.setOnClickListener(mCBCL);
        elec_b412.setOnClickListener(mCBCL);
        elec_b413.setOnClickListener(mCBCL);
        elec_b414.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b411:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b412:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b413:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b414:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
