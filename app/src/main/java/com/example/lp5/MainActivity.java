package com.example.lp5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);
        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.Test);
    }
    ContactFragment ContactFragment = new ContactFragment();
    TestFragment TestFragment = new TestFragment();
    NotificationFragment NotificationFragment = new NotificationFragment();

    @Override
    public boolean
    onNavigationItemSelected(@NonNull MenuItem item)
    {
        int item_id = item.getItemId();
        if (item_id==R.id.Contact){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, ContactFragment)
                    .commit();
            return true;
        } else if (item_id==R.id.Test){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, TestFragment)
                    .commit();
            return true;
        } else if (item_id==R.id.Notification) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, NotificationFragment)
                    .commit();
            return true;
        }
        return false;
    }
}