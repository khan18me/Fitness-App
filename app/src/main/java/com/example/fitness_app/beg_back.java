package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class beg_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_back);

        View vi_back_w1 = findViewById(R.id.vi_back_w1);
        vi_back_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout1();
            }
            private void beg_back_workout1() {
                String v1_beg_back_workout1 = "https://youtu.be/XZV9IwluPjw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_beg_back_workout1));
                startActivity(intent);
            }
        });

        View vi_back_w2 = findViewById(R.id.vi_back_w2);
        vi_back_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout2();
            }
            private void beg_back_workout2() {
                String v2_beg_back_workout2 = "https://youtu.be/CAwf7n6Luuc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_beg_back_workout2));
                startActivity(intent);
            }
        });
        View vi_back_w3 = findViewById(R.id.vi_back_w3);
        vi_back_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout3();
            }
            private void beg_back_workout3() {
                String v3_beg_back_workout3 = "https://youtu.be/-koP10y1qZI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_beg_back_workout3));
                startActivity(intent);
            }
        });
        View vi_back_w4 = findViewById(R.id.vi_back_w4);
        vi_back_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout4();
            }
            private void beg_back_workout4() {
                String v4_beg_back_workout4 = "https://youtu.be/jTNpZIl1qU0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_beg_back_workout4));
                startActivity(intent);
            }
        });
        View vi_back_w5 = findViewById(R.id.vi_back_w5);
        vi_back_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout5();
            }
            private void beg_back_workout5() {
                String v5_beg_back_workout5 = "https://youtu.be/ud5SXOI-b70";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_beg_back_workout5));
                startActivity(intent);
            }
        });
        View vi_back_w6 = findViewById(R.id.vi_back_w6);
        vi_back_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_back_workout6();
            }
            private void beg_back_workout6() {
                String v6_beg_back_workout6 = "https://youtu.be/ShRHEbxZ9l0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_beg_back_workout6));
                startActivity(intent);
            }
        });
    }
}