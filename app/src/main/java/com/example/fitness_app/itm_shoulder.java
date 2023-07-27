package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class itm_shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itm_shoulder);

        View vi_shoulder_w1 = findViewById(R.id.vi_shoulder_w1);
        vi_shoulder_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout1();
            }
            private void itm_shoulder_workout1() {
                String v1_itm_shoulder_workout1 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_itm_shoulder_workout1));
                startActivity(intent);
            }
        });

        View vi_shoulder_w2 = findViewById(R.id.vi_shoulder_w2);
        vi_shoulder_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout2();
            }
            private void itm_shoulder_workout2() {
                String v2_itm_shoulder_workout2 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_itm_shoulder_workout2));
                startActivity(intent);
            }
        });
        View vi_shoulder_w3 = findViewById(R.id.vi_shoulder_w3);
        vi_shoulder_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout3();
            }
            private void itm_shoulder_workout3() {
                String v3_itm_shoulder_workout3 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_itm_shoulder_workout3));
                startActivity(intent);
            }
        });
        View vi_shoulder_w4 = findViewById(R.id.vi_shoulder_w4);
        vi_shoulder_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout4();
            }
            private void itm_shoulder_workout4() {
                String v4_itm_shoulder_workout4 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_itm_shoulder_workout4));
                startActivity(intent);
            }
        });
        View vi_shoulder_w5 = findViewById(R.id.vi_shoulder_w5);
        vi_shoulder_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout5();
            }
            private void itm_shoulder_workout5() {
                String v5_itm_shoulder_workout5 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_itm_shoulder_workout5));
                startActivity(intent);
            }
        });
        View vi_shoulder_w6 = findViewById(R.id.vi_shoulder_w6);
        vi_shoulder_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_shoulder_workout6();
            }
            private void itm_shoulder_workout6() {
                String v6_itm_shoulder_workout6 = "https://www.youtube.com/watch?v=iGYeHsgb4CY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_itm_shoulder_workout6));
                startActivity(intent);
            }
        });
    }
}