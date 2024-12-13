package com.example.lp5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }
    private TextView FIO;
    private TextView Email;
    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        FIO =  view.findViewById(R.id.editTextText);
        Email = view.findViewById(R.id.editTextTextEmailAddress);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FIO.setText("");
                Email.setText("");
                Toast.makeText(getActivity().getApplicationContext(), "Ваши данные отправлены!", Toast.LENGTH_SHORT).show();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}