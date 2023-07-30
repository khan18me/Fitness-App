package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class itm_abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itm_abs);

        View vi_abs_w1 = findViewById(R.id.vi_abs_w1);
        vi_abs_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout1();
            }
            private void itm_abs_workout1() {
                String v1_itm_abs_workout1 = "https://youtu.be/Pr1ieGZ5atk";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v1_itm_abs_workout1));
                startActivity(intent);
            }
        });

        View vi_abs_w2 = findViewById(R.id.vi_abs_w2);
        vi_abs_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout2();
            }
            private void itm_abs_workout2() {
                String v2_itm_abs_workout2 = "https://youtu.be/TfTUk2AjV7g";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v2_itm_abs_workout2));
                startActivity(intent);
            }
        });
        View vi_abs_w3 = findViewById(R.id.vi_abs_w3);
        vi_abs_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout3();
            }
            private void itm_abs_workout3() {
                String v3_itm_abs_workout3 = "https://youtube.com/shorts/JzaIPJ8GV_w?feature=share";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v3_itm_abs_workout3));
                startActivity(intent);
            }
        });
        View vi_abs_w4 = findViewById(R.id.vi_abs_w4);
        vi_abs_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout4();
            }
            private void itm_abs_workout4() {
                String v4_itm_abs_workout4 = "https://youtu.be/QOCn3_iOAro";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v4_itm_abs_workout4));
                startActivity(intent);
            }
        });
        View vi_abs_w5 = findViewById(R.id.vi_abs_w5);
        vi_abs_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout5();
            }
            private void itm_abs_workout5() {
                String v5_itm_abs_workout5 = "https://youtu.be/1we3bh9uhqY";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v5_itm_abs_workout5));
                startActivity(intent);
            }
        });
        View vi_abs_w6 = findViewById(R.id.vi_abs_w6);
        vi_abs_w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout6();
            }
            private void itm_abs_workout6() {
                String v6_itm_abs_workout6 = "https://youtu.be/n6PyhehLqPI";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v6_itm_abs_workout6));
                startActivity(intent);
            }
        });
        View vi_abs_w7 = findViewById(R.id.vi_abs_w7);
        vi_abs_w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itm_abs_workout7();
            }
            private void itm_abs_workout7() {
                String v7_itm_abs_workout7 = "https://youtu.be/kICxJien7xM";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(v7_itm_abs_workout7));
                startActivity(intent);
            }
        });
    }
}