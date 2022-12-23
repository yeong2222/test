package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TEST extends AppCompatActivity {

    private CheckBox chapter1;
    private CheckBox chapter2;
    private CheckBox chapter3;
    private CheckBox chapter4;
    private CheckBox chapter5;
    private CheckBox chapter6;
    private CheckBox timelimit;
    private Button start;
    private EditText times;     //시간입력
    private CountDownTimer countDownTimer;
    private boolean timerRunning;   //타이머 상태
    private boolean firstState;     //처음인지 아닌지
    private long time = 0;
    private long tempTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        chapter1 = (CheckBox) findViewById(R.id.chapter1);
        chapter2 = (CheckBox) findViewById(R.id.chapter2);
        chapter3 = (CheckBox) findViewById(R.id.chapter3);
        chapter4 = (CheckBox) findViewById(R.id.chapter4);
        chapter5 = (CheckBox) findViewById(R.id.chapter5);
        chapter6 = (CheckBox) findViewById(R.id.chapter6);
        timelimit = (CheckBox) findViewById(R.id.timelimit);
        times = findViewById(R.id.timeText);
        start = findViewById(R.id.start);

        start.setOnClickListener((View.OnClickListener) start);


    }
}