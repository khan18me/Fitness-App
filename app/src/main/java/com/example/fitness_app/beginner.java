package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class beginner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        RelativeLayout relativeLayout1 = findViewById(R.id.beg_bicep_btn);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_biceps.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout2 = findViewById(R.id.beg_tricep_btn);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_triceps.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout3 = findViewById(R.id.beg_chest_btn);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_chest.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout4 = findViewById(R.id.beg_back_btn);
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_back.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout5 = findViewById(R.id.beg_shoulder_btn);
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_shoulder.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout6 = findViewById(R.id.beg_abs_btn);
        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_abs.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout7 = findViewById(R.id.beg_legs_btn);
        relativeLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(beginner.this, beg_legs.class);
                startActivity(intent);

            }
        });


    }
}