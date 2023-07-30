package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_biceps);

        View vi_bic_w1 = findViewById(R.id.vi_bic_w1);
        vi_bic_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout1();
            }
            private void adv_bic_workout1() {
                String v1_adv_bic_workout1 = "https://youtu.be/kwG2ipFRgfo";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_bic_workout1));
                startActivity(intent);
            }
        });

        View vi_bic_w2 = findViewById(R.id.vi_bic_w1);
        vi_bic_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout2();
            }
            private void adv_bic_workout2() {
                String v2_adv_bic_workout2 = "https://youtu.be/zC3nLlEvin4";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_bic_workout2));
                startActivity(intent);
            }
        });
        View vi_bic_w3 = findViewById(R.id.vi_bic_w3);
        vi_bic_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout3();
            }
            private void adv_bic_workout3() {
                String v3_adv_bic_workout3 = "https://youtu.be/fIWP-FRFNU0";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_bic_workout3));
                startActivity(intent);
            }
        });
        View vi_bic_w4 = findViewById(R.id.vi_bic_w4);
        vi_bic_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout4();
            }
            private void adv_bic_workout4() {
                String v4_adv_bic_workout4 = "https://youtu.be/0AUGkch3tzc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_bic_workout4));
                startActivity(intent);
            }
        });
        View vi_bic_w5 = findViewById(R.id.vi_bic_w5);
        vi_bic_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout5();
            }
            private void adv_bic_workout5() {
                String v5_adv_bic_workout5 = "https://youtu.be/NJnmRX4Od6c";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_bic_workout5));
                startActivity(intent);
            }
        });

        View vi_bic_w6 = findViewById(R.id.vi_bic_w6);
        vi_bic_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_bic_workout6();
            }
            private void adv_bic_workout6() {
                String v6_adv_bic_workout6 = "https://youtu.be/NFzTWp2qpiE";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_bic_workout6));
                startActivity(intent);
            }
        });
    }
}