package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class adv_triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_triceps);

        View vi_tricep_w1 = findViewById(R.id.vi_tricep_w1);
        vi_tricep_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout1();
            }
            private void adv_tricep_workout1() {
                String v1_adv_tricep_workout1 = "https://youtu.be/nEF0bv2FW94";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_adv_tricep_workout1));
                startActivity(intent);
            }
        });

        View vi_tricep_w2 = findViewById(R.id.vi_tricep_w2);
        vi_tricep_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout2();
            }
            private void adv_tricep_workout2() {
                String v2_adv_tricep_workout2 = "https://youtu.be/2i3o0bFZT_s";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_adv_tricep_workout2));
                startActivity(intent);
            }
        });
        View vi_tricep_w3 = findViewById(R.id.vi_tricep_w3);
        vi_tricep_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout3();
            }
            private void adv_tricep_workout3() {
                String v3_adv_tricep_workout3 = "https://youtu.be/d_KZxkY_0cM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_adv_tricep_workout3));
                startActivity(intent);
            }
        });
        View vi_tricep_w4 = findViewById(R.id.vi_tricep_w4);
        vi_tricep_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout4();
            }
            private void adv_tricep_workout4() {
                String v4_adv_tricep_workout4 = "https://youtu.be/REWv05om0ho";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_adv_tricep_workout4));
                startActivity(intent);
            }
        });
        View vi_tricep_w5 = findViewById(R.id.vi_tricep_w5);
        vi_tricep_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout5();
            }
            private void adv_tricep_workout5() {
                String v5_adv_tricep_workout5 = "https://youtu.be/-Vyt2QdsR7E";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_adv_tricep_workout5));
                startActivity(intent);
            }
        });
        View vi_tricep_w6 = findViewById(R.id.vi_tricep_w6);
        vi_tricep_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout6();
            }
            private void adv_tricep_workout6() {
                String v6_adv_tricep_workout6 = "https://youtu.be/J0DnG1_S92I";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_adv_tricep_workout6));
                startActivity(intent);
            }
        });
        View vi_tricep_w7 = findViewById(R.id.vi_tricep_w7);
        vi_tricep_w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adv_tricep_workout7();
            }
            private void adv_tricep_workout7() {
                String v7_adv_tricep_workout7 = "https://youtube.com/shorts/SLk3UUV8GuI?feature=share";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v7_adv_tricep_workout7));
                startActivity(intent);
            }
        });
    }
}