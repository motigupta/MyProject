package com.example.megha.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.megha.myapp.Home.DashboardFragment;
import com.example.megha.myapp.Home.OperationsFragment;
import com.example.megha.myapp.Home.TicketsFragment;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_dashboard:
                        selectedFragment = DashboardFragment.newInstance();
                        break;
                    case R.id.navigation_operations:
                        selectedFragment = OperationsFragment.newInstance();
                        break;
                    case R.id.navigation_tickets:
                        selectedFragment = TicketsFragment.newInstance();
                        break;
                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, selectedFragment);
                transaction.commit();
                return true;
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_message) {
            Intent intent1 = new Intent(this, MessageActivity.class);
            this.startActivity(intent1);
            return true;
        }

        if (id == R.id.menu_notification) {
            Intent intent1 = new Intent(this, NotificationActivity.class);
            this.startActivity(intent1);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
