package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class beg_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_abs);


        View vi_abs_w1 = findViewById(R.id.vi_abs_w1);
        vi_abs_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout1();
            }
            private void beg_abs_workout1() {
                String v1_beg_abs_workout1 = "https://youtu.be/5ER5Of4MOPI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_beg_abs_workout1));
                startActivity(intent);
            }
        });

        View vi_abs_w2 = findViewById(R.id.vi_abs_w2);
        vi_abs_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout2();
            }
            private void beg_abs_workout2() {
                String v2_beg_abs_workout2 = "https://youtu.be/l4kQd9eWclE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_beg_abs_workout2));
                startActivity(intent);
            }
        });
        View vi_abs_w3 = findViewById(R.id.vi_abs_w3);
        vi_abs_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout3();
            }
            private void beg_abs_workout3() {
                String v3_beg_abs_workout3 = "https://youtu.be/1we3bh9uhqY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_beg_abs_workout3));
                startActivity(intent);
            }
        });
        View vi_abs_w4 = findViewById(R.id.vi_abs_w4);
        vi_abs_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout4();
            }
            private void beg_abs_workout4() {
                String v4_beg_abs_workout4 = "https://youtu.be/Ehy8G39d_PM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_beg_abs_workout4));
                startActivity(intent);
            }
        });
        View vi_abs_w5 = findViewById(R.id.vi_abs_w5);
        vi_abs_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout5();
            }
            private void beg_abs_workout5() {
                String v5_beg_abs_workout5 = "https://youtu.be/wkD8rjkodUI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_beg_abs_workout5));
                startActivity(intent);
            }
        });
        View vi_abs_w6 = findViewById(R.id.vi_abs_w6);
        vi_abs_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beg_abs_workout6();
            }
            private void beg_abs_workout6() {
                String v6_beg_abs_workout6 = "https://youtu.be/7rRWy7-Gokg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_beg_abs_workout6));
                startActivity(intent);
            }
        });
    }
}