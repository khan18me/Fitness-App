package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);


        RelativeLayout relativeLayout1 = findViewById(R.id.beginner);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levels.this, beginner.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout2 = findViewById(R.id.intermediate);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levels.this, intermediate.class);
                startActivity(intent);

            }
        });
        RelativeLayout relativeLayout3 = findViewById(R.id.advance);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levels.this, advance.class);
                startActivity(intent);

            }
        });


    }
}