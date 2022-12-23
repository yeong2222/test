package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class elecchapter62 extends AppCompatActivity {

    private CheckBox elec_b621;
    private CheckBox elec_b622;
    private CheckBox elec_b623;
    private CheckBox elec_b624;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elecchapter62);


        elec_b621 = (CheckBox) findViewById(R.id.elec_b621);
        elec_b622 = (CheckBox) findViewById(R.id.elec_b622);
        elec_b623 = (CheckBox) findViewById(R.id.elec_b623);
        elec_b624 = (CheckBox) findViewById(R.id.elec_b624);


        elec_b621.setOnClickListener(mCBCL);
        elec_b622.setOnClickListener(mCBCL);
        elec_b623.setOnClickListener(mCBCL);
        elec_b624.setOnClickListener(mCBCL);

    }
    View.OnClickListener mCBCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            switch (view.getId()){
                case R.id.elec_b621:

                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b622:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "정답", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.elec_b623:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.elec_b624:
                    if (checked) {
                        Toast.makeText(getApplicationContext(), "오답", Toast.LENGTH_SHORT).show();
                    }
                    break;

            }

        }

    };
}
