package com.example.fitness_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    CardView exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        RelativeLayout relativeLayout1 = findViewById(R.id.exercise);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, levels.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.shop);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, shop.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.diet);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, diet.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout4 = findViewById(R.id.reminder);
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, reminder.class);
                startActivity(intent);

            }
        });

        RelativeLayout relativeLayout5 = findViewById(R.id.settings);
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, settings.class);
                startActivity(intent);
            }
        });



    }
    public void onBackPressed() {
        boolean isMainActivity=true;
        if (isMainActivity) {
            showExitConfirmationDialog();
        } else {
            super.onBackPressed();
        }
    }

    private void showExitConfirmationDialog() {
            new AlertDialog.Builder(this)
                    .setTitle("Exit")
                    .setMessage("Are you sure you want to exit?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Exit the activity when the user chooses "Yes"
                            finish();
                        }
                    })
                    .setNegativeButton("No", null) // Do nothing when the user chooses "No"
                    .show();

    }
}
