package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class advance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        final Button adv_bicep_btn = (Button) findViewById(R.id.adv_bicep_btn);
        adv_bicep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), adv_biceps.class);
                startActivity(i);
            }
        });
        final Button adv_tri_btn = (Button) findViewById(R.id.adv_tri_btn);
        adv_tri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_triceps.class);
                startActivity(i);


            }
        });
        final Button adv_chest_btn = (Button) findViewById(R.id.adv_chest_btn);
        adv_chest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_chest.class);
                startActivity(i);


            }
        });
        final Button adv_back_btn = (Button) findViewById(R.id.adv_back_btn);
        adv_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_back.class);
                startActivity(i);


            }
        });
        final Button adv_shldr_btn = (Button) findViewById(R.id.adv_shldr_btn);
        adv_shldr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_shoulder.class);
                startActivity(i);


            }
        });
        final Button adv_abs_btn = (Button) findViewById(R.id.adv_abs_btn);
        adv_abs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_abs.class);
                startActivity(i);


            }
        });
        final Button adv_legs_btn = (Button) findViewById(R.id.adv_legs_btn);
        adv_legs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adv_legs.class);
                startActivity(i);


            }
        });
    }
}