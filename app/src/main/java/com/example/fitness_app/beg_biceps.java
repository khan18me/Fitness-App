package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class beg_biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_biceps);

        View vi_bic_w1 = findViewById(R.id.vi_bic_w1);
        vi_bic_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout1();
            }
            private void beg_bic_workout1() {
                String v1_beg_bic_workout1 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_beg_bic_workout1));
                startActivity(intent);
            }
        });

        View vi_bic_w2 = findViewById(R.id.vi_bic_w1);
        vi_bic_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout2();
            }
            private void beg_bic_workout2() {
                String v2_beg_bic_workout2 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_beg_bic_workout2));
                startActivity(intent);
            }
        });
        View vi_bic_w3 = findViewById(R.id.vi_bic_w3);
        vi_bic_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout3();
            }
            private void beg_bic_workout3() {
                String v3_beg_bic_workout3 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_beg_bic_workout3));
                startActivity(intent);
            }
        });
        View vi_bic_w4 = findViewById(R.id.vi_bic_w1);
        vi_bic_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout4();
            }
            private void beg_bic_workout4() {
                String v4_beg_bic_workout4 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_beg_bic_workout4));
                startActivity(intent);
            }
        });
        View vi_bic_w5 = findViewById(R.id.vi_bic_w5);
        vi_bic_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout5();
            }
            private void beg_bic_workout5() {
                String v5_beg_bic_workout5 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_beg_bic_workout5));
                startActivity(intent);
            }
        });

        View vi_bic_w6 = findViewById(R.id.vi_bic_w6);
        vi_bic_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_bic_workout6();
            }
            private void beg_bic_workout6() {
                String v6_beg_bic_workout6 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_beg_bic_workout6));
                startActivity(intent);
            }
        });
    }
}