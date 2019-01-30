package com.example.megha.myapp.Operation_link_pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.megha.myapp.R;

public class OrderActivity extends AppCompatActivity {

    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          button=(Button)findViewById(R.id.btn);
          button.setOnClickListener(new View.OnClickListener() {

              public void onClick(View v) {
           Intent i=new Intent(getApplicationContext(),PlaceorderActivity.class);
           startActivity(i);
            }
         });
    }
}
