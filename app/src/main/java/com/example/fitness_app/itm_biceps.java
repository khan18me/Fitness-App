package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class itm_biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itm_biceps);

        View vi_bicep_w1 = findViewById(R.id.vi_bicep_w1);
        vi_bicep_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout1();
            }
            private void itm_bicep_workout1() {
                String v1_itm_bicep_workout1 = "https://youtu.be/kwG2ipFRgfo";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_itm_bicep_workout1));
                startActivity(intent);
            }
        });

        View vi_bicep_w2 = findViewById(R.id.vi_bicep_w2);
        vi_bicep_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout2();
            }
            private void itm_bicep_workout2() {
                String v2_itm_bicep_workout2 = "https://youtu.be/8d2we4UqOSs";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_itm_bicep_workout2));
                startActivity(intent);
            }
        });
        View vi_bicep_w3 = findViewById(R.id.vi_bicep_w3);
        vi_bicep_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout3();
            }
            private void itm_bicep_workout3() {
                String v3_itm_bicep_workout3 = "https://youtu.be/TwD-YGVP4Bk";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_itm_bicep_workout3));
                startActivity(intent);
            }
        });
        View vi_bicep_w4 = findViewById(R.id.vi_bicep_w4);
        vi_bicep_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout4();
            }
            private void itm_bicep_workout4() {
                String v4_itm_bicep_workout4 = "https://youtu.be/Gydpcouclx8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_itm_bicep_workout4));
                startActivity(intent);
            }
        });
        View vi_bicep_w5 = findViewById(R.id.vi_bicep_w5);
        vi_bicep_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout5();
            }
            private void itm_bicep_workout5() {
                String v5_itm_bicep_workout5 = "https://youtu.be/0AUGkch3tzc";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_itm_bicep_workout5));
                startActivity(intent);
            }
        });

        View vi_bicep_w6 = findViewById(R.id.vi_bicep_w6);
        vi_bicep_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_bicep_workout6();
            }
            private void itm_bicep_workout6() {
                String v6_itm_bicep_workout6 = "https://youtu.be/eve_ZgHapkw";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_itm_bicep_workout6));
                startActivity(intent);
            }
        });
    }
}