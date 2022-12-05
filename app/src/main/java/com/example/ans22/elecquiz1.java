package com.example.ans22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class elecquiz1 extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elecquiz1);



        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        quiz1 fragment1 = new quiz1();
        transaction.replace(R.id.frame1, fragment1);
        transaction.commit();

    }
}