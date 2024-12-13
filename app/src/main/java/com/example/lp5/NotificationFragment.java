package com.example.lp5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.app.NotificationManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }
private Button button2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        button2 = view.findViewById(R.id.button2);

        MyPushNotification myPushNotification = new MyPushNotification(requireContext(),
                requireActivity().getSystemService(NotificationManager.class));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("info","Кривоносов Ф.А./Т-413901 ИСиТ");
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}