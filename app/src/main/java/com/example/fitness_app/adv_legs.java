package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_legs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_legs);


        View vi_legs_w1 = findViewById(R.id.vi_legs_w1);
        vi_legs_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout1();
            }
            private void adv_legs_workout1() {
                String v1_adv_legs_workout1 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_legs_workout1));
                startActivity(intent);
            }
        });

        View vi_legs_w2 = findViewById(R.id.vi_legs_w2);
        vi_legs_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout2();
            }
            private void adv_legs_workout2() {
                String v2_adv_legs_workout2 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_legs_workout2));
                startActivity(intent);
            }
        });
        View vi_legs_w3 = findViewById(R.id.vi_legs_w3);
        vi_legs_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout3();
            }
            private void adv_legs_workout3() {
                String v3_adv_legs_workout3 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_legs_workout3));
                startActivity(intent);
            }
        });
        View vi_legs_w4 = findViewById(R.id.vi_legs_w4);
        vi_legs_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout4();
            }
            private void adv_legs_workout4() {
                String v4_adv_legs_workout4 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_legs_workout4));
                startActivity(intent);
            }
        });
        View vi_legs_w5 = findViewById(R.id.vi_legs_w5);
        vi_legs_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout5();
            }
            private void adv_legs_workout5() {
                String v5_adv_legs_workout5 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_legs_workout5));
                startActivity(intent);
            }
        });
        View vi_legs_w6 = findViewById(R.id.vi_legs_w6);
        vi_legs_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout6();
            }
            private void adv_legs_workout6() {
                String v6_adv_legs_workout6 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_legs_workout6));
                startActivity(intent);
            }
        });
        View vi_legs_w7 = findViewById(R.id.vi_legs_w7);
        vi_legs_w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_legs_workout7();
            }
            private void adv_legs_workout7() {
                String v7_adv_legs_workout7 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v7_adv_legs_workout7));
                startActivity(intent);
            }
        });
    }
}