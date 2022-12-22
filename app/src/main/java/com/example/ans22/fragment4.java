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

public class fragment4 extends Fragment {

    private View view;
    private Button btn_m3;
    private CheckBox CheckBox41;
    private CheckBox CheckBox42;
    private CheckBox CheckBox43;
    private CheckBox CheckBox44;
    private TextView textView2;
    private Button btn_rm3;


    @Nullable
    @Override
    /* fragment실행할때 수행하는 생명 주기 */
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_3,container,false);


        CheckBox41= view.findViewById(R.id.CheckBox41);
        CheckBox42= view.findViewById(R.id.CheckBox42);
        CheckBox43= view.findViewById(R.id.CheckBox43);
        CheckBox44= view.findViewById(R.id.CheckBox44);
        btn_rm3= view.findViewById(R.id.btn_rm3);
        btn_m3= view.findViewById(R.id.btn_m3);



        btn_rm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이전프래그먼트로 이동
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                quiz3 fragment3 = new quiz3();
                transaction.replace(R.id.frame1, fragment3);
                transaction.commit();


            }
        });

        btn_m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                fragment15 fragment15 = new fragment15();
                transaction.replace(R.id.frame1, fragment15);
                transaction.commit();

            }
        });



        return view;
    }
}