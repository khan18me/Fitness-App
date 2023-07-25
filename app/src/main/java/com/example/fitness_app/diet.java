package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);


        final Button wg_btn = (Button) findViewById(R.id.wg_btn);
        wg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), weight_gain.class);
                startActivity(i);


            }
        });
        final Button wl_btn = (Button) findViewById(R.id.wl_btn);
        wl_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), weight_loss.class);
                startActivity(i);


            }
        });

        final Button prep_home_btn = (Button) findViewById(R.id.prep_home_btn);
        prep_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), prepathome.class);
                startActivity(i);

            }
        });
    }
}