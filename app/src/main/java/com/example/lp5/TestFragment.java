package com.example.lp5;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TestFragment extends Fragment {

    public TestFragment() {
        // Required empty public constructor
    }
    private Button button3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        button3 = (Button) view.findViewById(R.id.button3);
        String[] ans ={"CE-27 Ground Breaker","CM-10 Clinician","UF-84 Doubt Killer","AF-52 Lockdown"};
        boolean[] ans_b={true,false,false,false};

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("The question")
                        .setMultiChoiceItems(ans, ans_b, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                                ans_b[i]=b;
                            }
                        })
                        .setPositiveButton("Answer", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (ans_b[0] && !ans_b[1] && !ans_b[2]){
                                    Toast mytost = Toast.makeText(getContext().getApplicationContext(), "Luck is on your side today", Toast.LENGTH_LONG);
                                    mytost.show();
                                }
                                else{
                                    Toast mytost = Toast.makeText(getContext().getApplicationContext(), "Unlucky", Toast.LENGTH_LONG);
                                    mytost.show();
                                }
                            }
                        })
                        .setCancelable(false);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        return view;
    }
}