package com.example.ans22;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class quiz1 extends Fragment {
    private View view;
    private Button btn_m1;
    private CheckBox CheckBox11;
    private CheckBox CheckBox12;
    private CheckBox CheckBox13;
    private CheckBox CheckBox14;




    @Nullable
    @Override




    /* fragment실행할때 수행하는 생명 주기 */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1,container,false);





        CheckBox11= view.findViewById(R.id.CheckBox11);
        CheckBox12= view.findViewById(R.id.CheckBox12);
        CheckBox13= view.findViewById(R.id.CheckBox13);
        CheckBox14= view.findViewById(R.id.CheckBox14);
        btn_m1= view.findViewById(R.id.btn_m1);


        btn_m1.setOnClickListener(new View.OnClickListener() { //프래그먼트 2로 이동
            @Override
            public void onClick(View view) {

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

        quiz2 fragment2 = new quiz2();
        transaction.replace(R.id.frame1, fragment2);
        transaction.commit();
            }
        });




        return view;
    }





}
