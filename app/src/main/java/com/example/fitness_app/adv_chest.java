package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_chest);

        View vi_chest_w1 = findViewById(R.id.vi_chest_w1);
        vi_chest_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout1();
            }
            private void adv_chest_workout1() {
                String v1_adv_chest_workout1 = "https://youtu.be/rT7DgCr-3pg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_chest_workout1));
                startActivity(intent);
            }
        });

        View vi_chest_w2 = findViewById(R.id.vi_chest_w2);
        vi_chest_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout2();
            }
            private void adv_chest_workout2() {
                String v2_adv_chest_workout2 = "https://youtu.be/8iPEnn-ltC8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_chest_workout2));
                startActivity(intent);
            }
        });
        View vi_chest_w3 = findViewById(R.id.vi_chest_w3);
        vi_chest_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout3();
            }
            private void adv_chest_workout3() {
                String v3_adv_chest_workout3 = "https://youtu.be/2i3o0bFZT_s";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_chest_workout3));
                startActivity(intent);
            }
        });
        View vi_chest_w4 = findViewById(R.id.vi_chest_w4);
        vi_chest_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout4();
            }
            private void adv_chest_workout4() {
                String v4_adv_chest_workout4 = "https://youtu.be/taI4XduLpTk";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_chest_workout4));
                startActivity(intent);
            }
        });
        View vi_chest_w5 = findViewById(R.id.vi_chest_w5);
        vi_chest_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout5();
            }
            private void adv_chest_workout5() {
                String v5_adv_chest_workout5 = "https://youtu.be/eozdVDA78K0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_chest_workout5));
                startActivity(intent);
            }
        });
        View vi_chest_w6 = findViewById(R.id.vi_chest_w6);
        vi_chest_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout6();
            }
            private void adv_chest_workout6() {
                String v6_adv_chest_workout6 = "https://youtu.be/QqTlnhzku5c";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_chest_workout6));
                startActivity(intent);
            }
        });
        View vi_chest_w7 = findViewById(R.id.vi_chest_w7);
        vi_chest_w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_chest_workout7();
            }
            private void adv_chest_workout7() {
                String v7_adv_chest_workout7 = "https://youtu.be/QcAAKuEgYjw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v7_adv_chest_workout7));
                startActivity(intent);
            }
        });
    }
}