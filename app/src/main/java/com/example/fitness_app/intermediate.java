package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intermediate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        final Button itm_bicep_btn = (Button) findViewById(R.id.itm_bicep_btn);
        itm_bicep_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), itm_biceps.class);
                startActivity(i);
            }
        });
        final Button itm_tri_btn = (Button) findViewById(R.id.itm_tri_btn);
        itm_tri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_triceps.class);
                startActivity(i);


            }
        });
        final Button itm_chest_btn = (Button) findViewById(R.id.itm_chest_btn);
        itm_chest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_chest.class);
                startActivity(i);


            }
        });
        final Button itm_back_btn = (Button) findViewById(R.id.itm_back_btn);
        itm_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_back.class);
                startActivity(i);


            }
        });
        final Button itm_shldr_btn = (Button) findViewById(R.id.itm_shldr_btn);
        itm_shldr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_shoulder.class);
                startActivity(i);


            }
        });
        final Button itm_abs_btn = (Button) findViewById(R.id.itm_abs_btn);
        itm_abs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_abs.class);
                startActivity(i);


            }
        });
        final Button itm_legs_btn = (Button) findViewById(R.id.itm_legs_btn);
        itm_legs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),itm_legs.class);
                startActivity(i);


            }
        });
    }
}