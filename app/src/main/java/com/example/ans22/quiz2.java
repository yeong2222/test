package com.example.ans22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class quiz2 extends Fragment {
    private View view;
    private Button btn_m2;
    private CheckBox CheckBox21;
    private CheckBox CheckBox22;
    private CheckBox CheckBox23;
    private CheckBox CheckBox24;
    private TextView textView2;
    private Button btn_rm2;


    @Nullable
    @Override
    /* fragment실행할때 수행하는 생명 주기 */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2,container,false);


        CheckBox21= view.findViewById(R.id.CheckBox21);
        CheckBox22= view.findViewById(R.id.CheckBox22);
        CheckBox23= view.findViewById(R.id.CheckBox23);
        CheckBox24= view.findViewById(R.id.CheckBox24);
        btn_rm2= view.findViewById(R.id.btn_rm2);
        btn_m2= view.findViewById(R.id.btn_m2);



        btn_rm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이전프래그먼트로 이동
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                quiz1 fragment1 = new quiz1();
                transaction.replace(R.id.frame1, fragment1);
                transaction.commit();


            }
        });

       btn_m2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

               quiz3 fragment3 = new quiz3();
               transaction.replace(R.id.frame1, fragment3);
               transaction.commit();

           }
       });

        return view;
    }
}
