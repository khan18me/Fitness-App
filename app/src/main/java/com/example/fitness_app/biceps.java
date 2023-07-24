package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fitness_app.MainActivity;
import com.example.fitness_app.R;

public class biceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);

        final Button bicep_w1 = (Button) findViewById(R.id.bicep_w1);
        bicep_w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), beg_bic_w1.class);
                startActivity(i);
            }
        });
        final Button bicep_w2 = (Button) findViewById(R.id.bicep_w2);
        bicep_w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_bic_w1.class);
                startActivity(i);


            }
        });
        final Button bicep_w3 = (Button) findViewById(R.id.bicep_w3);
        bicep_w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_bic_w1.class);
                startActivity(i);


            }
        });
        final Button bicep_w4 = (Button) findViewById(R.id.bicep_w4);
        bicep_w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), beg_bic_w1.class);
                startActivity(i);


            }
        });
        final Button bicep_w5 = (Button) findViewById(R.id.bicep_w5);
        bicep_w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),beg_bic_w1.class);
                startActivity(i);


            }
        });
    }
}