package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_abs);

        View vi_abs_w1 = findViewById(R.id.vi_abs_w1);
        vi_abs_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout1();
            }
            private void adv_abs_workout1() {
                String v1_adv_abs_workout1 = "https://youtu.be/Pr1ieGZ5atk";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_abs_workout1));
                startActivity(intent);
            }
        });

        View vi_abs_w2 = findViewById(R.id.vi_abs_w2);
        vi_abs_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout2();
            }
            private void adv_abs_workout2() {
                String v2_adv_abs_workout2 = "https://youtu.be/kICxJien7xM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_abs_workout2));
                startActivity(intent);
            }
        });
        View vi_abs_w3 = findViewById(R.id.vi_abs_w3);
        vi_abs_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout3();
            }
            private void adv_abs_workout3() {
                String v3_adv_abs_workout3 = "https://youtu.be/pAplQXk3dkU";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_abs_workout3));
                startActivity(intent);
            }
        });
        View vi_abs_w4 = findViewById(R.id.vi_abs_w4);
        vi_abs_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout4();
            }
            private void adv_abs_workout4() {
                String v4_adv_abs_workout4 = "https://youtu.be/hCE6ejbY3CM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_abs_workout4));
                startActivity(intent);
            }
        });
        View vi_abs_w5 = findViewById(R.id.vi_abs_w5);
        vi_abs_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout5();
            }
            private void adv_abs_workout5() {
                String v5_adv_abs_workout5 = "https://youtu.be/TfTUk2AjV7g";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_abs_workout5));
                startActivity(intent);
            }
        });
        View vi_abs_w6 = findViewById(R.id.vi_abs_w6);
        vi_abs_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_abs_workout6();
            }
            private void adv_abs_workout6() {
                String v6_adv_abs_workout6 = "https://youtu.be/Xhw699i3vAc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_abs_workout6));
                startActivity(intent);
            }
        });
    }
}