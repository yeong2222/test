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

public class quiz3 extends Fragment {
    private View view;
    private Button btn_m3;
    private CheckBox CheckBox31;
    private CheckBox CheckBox32;
    private CheckBox CheckBox33;
    private CheckBox CheckBox34;
    private TextView textView2;
    private Button btn_rm3;


    @Nullable
    @Override
    /* fragment실행할때 수행하는 생명 주기 */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_3,container,false);


        CheckBox31= view.findViewById(R.id.CheckBox31);
        CheckBox32= view.findViewById(R.id.CheckBox32);
        CheckBox33= view.findViewById(R.id.CheckBox33);
        CheckBox34= view.findViewById(R.id.CheckBox34);
        btn_rm3= view.findViewById(R.id.btn_rm3);
        btn_m3= view.findViewById(R.id.btn_m3);



        btn_rm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이전프래그먼트로 이동
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                quiz2 fragment2 = new quiz2();
                transaction.replace(R.id.frame1, fragment2);
                transaction.commit();


            }
        });

        btn_m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment4 fragment4 = new fragment4();
                transaction.replace(R.id.frame1, fragment4);
                transaction.commit();

            }
        });


        return view;
    }
}
