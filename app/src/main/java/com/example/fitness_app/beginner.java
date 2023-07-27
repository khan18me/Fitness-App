package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beginner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        final Button beg_bicep_btn = (Button) findViewById(R.id.beg_bicep_btn);
        beg_bicep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_biceps.class);
                startActivity(i);
            }
        });
        final Button beg_tri_btn = (Button) findViewById(R.id.beg_tri_btn);
        beg_tri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_triceps.class);
                startActivity(i);


            }
        });
        final Button beg_chest_btn = (Button) findViewById(R.id.beg_chest_btn);
        beg_chest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_chest.class);
                startActivity(i);


            }
        });
        final Button beg_back_btn = (Button) findViewById(R.id.beg_back_btn);
        beg_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_back.class);
                startActivity(i);


            }
        });
        final Button beg_shldr_btn = (Button) findViewById(R.id.beg_shldr_btn);
        beg_shldr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_shoulder.class);
                startActivity(i);


            }
        });
        final Button beg_abs_btn = (Button) findViewById(R.id.beg_abs_btn);
        beg_abs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_abs.class);
                startActivity(i);


            }
        });
        final Button beg_legs_btn = (Button) findViewById(R.id.beg_legs_btn);
        beg_legs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_legs.class);
                startActivity(i);


            }
        });
    }
}