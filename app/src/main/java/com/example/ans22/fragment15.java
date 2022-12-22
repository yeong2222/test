package com.example.ans22;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class fragment15 extends Fragment {
    private View view;
    private Button btn_m5;
    private CheckBox CheckBox51;
    private CheckBox CheckBox52;
    private CheckBox CheckBox53;
    private CheckBox CheckBox54;
    private TextView textView2;
    private Button btn_rm5;


    @Nullable
    @Override
    /* fragment실행할때 수행하는 생명 주기 */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_3,container,false);


        CheckBox51= view.findViewById(R.id.CheckBox51);
        CheckBox52= view.findViewById(R.id.CheckBox52);
        CheckBox53= view.findViewById(R.id.CheckBox53);
        CheckBox54= view.findViewById(R.id.CheckBox54);
        btn_rm5= view.findViewById(R.id.btn_rm5);
        btn_m5= view.findViewById(R.id.btn_m5);



        btn_rm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이전프래그먼트로 이동
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment4 fragment4 = new fragment4();
                transaction.replace(R.id.frame1, fragment4);
                transaction.commit();


            }
        });




        return view;
    }

}