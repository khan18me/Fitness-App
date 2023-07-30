package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class itm_triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itm_triceps);

        View vi_tricep_w1 = findViewById(R.id.vi_tricep_w1);
        vi_tricep_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout1();
            }
            private void itm_tricep_workout1() {
                String v1_itm_tricep_workout1 = "https://youtube.com/shorts/43rg7fBNP2w?feature=share";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_itm_tricep_workout1));
                startActivity(intent);
            }
        });

        View vi_tricep_w2 = findViewById(R.id.vi_tricep_w2);
        vi_tricep_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout2();
            }
            private void itm_tricep_workout2() {
                String v2_itm_tricep_workout2 = "https://youtube.com/shorts/ci5tcFgIntI?feature=share";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_itm_tricep_workout2));
                startActivity(intent);
            }
        });
        View vi_tricep_w3 = findViewById(R.id.vi_tricep_w3);
        vi_tricep_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout3();
            }
            private void itm_tricep_workout3() {
                String v3_itm_tricep_workout3 = "https://youtu.be/b5JzUH8gsOg";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_itm_tricep_workout3));
                startActivity(intent);
            }
        });
        View vi_tricep_w4 = findViewById(R.id.vi_tricep_w4);
        vi_tricep_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout4();
            }
            private void itm_tricep_workout4() {
                String v4_itm_tricep_workout4 = "https://youtu.be/2-LAMcpzODU";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_itm_tricep_workout4));
                startActivity(intent);
            }
        });
        View vi_tricep_w5 = findViewById(R.id.vi_tricep_w5);
        vi_tricep_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout5();
            }
            private void itm_tricep_workout5() {
                String v5_itm_tricep_workout5 = "https://youtu.be/pD3mD6WgykM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_itm_tricep_workout5));
                startActivity(intent);
            }
        });

        View vi_tricep_w6 = findViewById(R.id.vi_tricep_w6);
        vi_tricep_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_tricep_workout6();
            }
            private void itm_tricep_workout6() {
                String v6_itm_tricep_workout6 = "https://youtu.be/6SS6K3lAwZ8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_itm_tricep_workout6));
                startActivity(intent);
            }
        });
    }
}