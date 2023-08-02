package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        RelativeLayout relativeLayout1 = findViewById(R.id.wg_btn);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(diet.this, weight_gain.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout2 = findViewById(R.id.wl_btn);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(diet.this, weight_loss.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout3 = findViewById(R.id.prep_home_btn);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(diet.this, prepathome.class);
                startActivity(intent);

            }
        });


    }
}