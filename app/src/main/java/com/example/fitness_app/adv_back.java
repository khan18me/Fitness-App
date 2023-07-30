package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_back);

        View vi_back_w1 = findViewById(R.id.vi_back_w1);
        vi_back_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout1();
            }
            private void adv_back_workout1() {
                String v1_adv_back_workout1 = "https://youtu.be/r4MzxtBKyNE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_back_workout1));
                startActivity(intent);
            }
        });

        View vi_back_w2 = findViewById(R.id.vi_back_w2);
        vi_back_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout2();
            }
            private void adv_back_workout2() {
                String v2_adv_back_workout2 = "https://youtu.be/dhn5lND_Dfs";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_back_workout2));
                startActivity(intent);
            }
        });
        View vi_back_w3 = findViewById(R.id.vi_back_w3);
        vi_back_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout3();
            }
            private void adv_back_workout3() {
                String v3_adv_back_workout3 = "https://youtu.be/FWJR5Ve8bnQ";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_back_workout3));
                startActivity(intent);
            }
        });
        View vi_back_w4 = findViewById(R.id.vi_back_w4);
        vi_back_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout4();
            }
            private void adv_back_workout4() {
                String v4_adv_back_workout4 = "https://youtu.be/j3Igk5nyZE4";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_back_workout4));
                startActivity(intent);
            }
        });
        View vi_back_w5 = findViewById(R.id.vi_back_w5);
        vi_back_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout5();
            }
            private void adv_back_workout5() {
                String v5_adv_back_workout5 = "https://youtu.be/pYcpY20QaE8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_back_workout5));
                startActivity(intent);
            }
        });
        View vi_back_w6 = findViewById(R.id.vi_back_w6);
        vi_back_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_back_workout6();
            }
            private void adv_back_workout6() {
                String v6_adv_back_workout6 = "https://youtu.be/ph3pddpKzzw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_back_workout6));
                startActivity(intent);
            }
        });
    }
}