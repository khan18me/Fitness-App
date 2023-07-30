package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_shoulder);

        View vi_shoulder_w1 = findViewById(R.id.vi_shoulder_w1);
        vi_shoulder_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout1();
            }
            private void adv_shoulder_workout1() {
                String v1_adv_shoulder_workout1 = "https://youtu.be/2yjwXTZQDDI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_shoulder_workout1));
                startActivity(intent);
            }
        });

        View vi_shoulder_w2 = findViewById(R.id.vi_shoulder_w2);
        vi_shoulder_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout2();
            }
            private void adv_shoulder_workout2() {
                String v2_adv_shoulder_workout2 = "https://youtu.be/3ml7BH7mNwQ";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_shoulder_workout2));
                startActivity(intent);
            }
        });
        View vi_shoulder_w3 = findViewById(R.id.vi_shoulder_w3);
        vi_shoulder_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout3();
            }
            private void adv_shoulder_workout3() {
                String v3_adv_shoulder_workout3 = "https://youtu.be/XPPfnSEATJA";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_shoulder_workout3));
                startActivity(intent);
            }
        });
        View vi_shoulder_w4 = findViewById(R.id.vi_shoulder_w4);
        vi_shoulder_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout4();
            }
            private void adv_shoulder_workout4() {
                String v4_adv_shoulder_workout4 = "https://youtu.be/evXOlgLTPCw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_shoulder_workout4));
                startActivity(intent);
            }
        });
        View vi_shoulder_w5 = findViewById(R.id.vi_shoulder_w5);
        vi_shoulder_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout5();
            }
            private void adv_shoulder_workout5() {
                String v5_adv_shoulder_workout5 = "https://youtu.be/IhZLB48kluc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_shoulder_workout5));
                startActivity(intent);
            }
        });
        View vi_shoulder_w6 = findViewById(R.id.vi_shoulder_w6);
        vi_shoulder_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_shoulder_workout6();
            }
            private void adv_shoulder_workout6() {
                String v6_adv_shoulder_workout6 = "https://youtu.be/rep-qVOkqgk";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_shoulder_workout6));
                startActivity(intent);
            }
        });
    }
}