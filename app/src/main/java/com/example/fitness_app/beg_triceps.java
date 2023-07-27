package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class beg_triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_triceps);

        View vi_tricep_w1 = findViewById(R.id.vi_tricep_w1);
        vi_tricep_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_tricep_workout1();
            }
            private void beg_tricep_workout1() {
                String v1_beg_tricep_workout1 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_beg_tricep_workout1));
                startActivity(intent);
            }
        });

        View vi_tricep_w2 = findViewById(R.id.vi_tricep_w2);
        vi_tricep_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_tricep_workout2();
            }
            private void beg_tricep_workout2() {
                String v2_beg_tricep_workout2 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_beg_tricep_workout2));
                startActivity(intent);
            }
        });
        View vi_tricep_w3 = findViewById(R.id.vi_tricep_w3);
        vi_tricep_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_tricep_workout3();
            }
            private void beg_tricep_workout3() {
                String v3_beg_tricep_workout3 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_beg_tricep_workout3));
                startActivity(intent);
            }
        });
        View vi_tricep_w4 = findViewById(R.id.vi_tricep_w4);
        vi_tricep_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_tricep_workout4();
            }
            private void beg_tricep_workout4() {
                String v4_beg_tricep_workout4 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_beg_tricep_workout4));
                startActivity(intent);
            }
        });
        View vi_tricep_w5 = findViewById(R.id.vi_tricep_w5);
        vi_tricep_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_tricep_workout5();
            }
            private void beg_tricep_workout5() {
                String v5_beg_tricep_workout5 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_beg_tricep_workout5));
                startActivity(intent);
            }
        });

    }
}