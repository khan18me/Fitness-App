package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    CardView exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout relativeLayout1 = findViewById(R.id.exercise);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, levels.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.shop);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, shop.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.diet);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, diet.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout = findViewById(R.id.reminder);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, reminder.class);
                startActivity(intent);

            }
        });
    }
}
