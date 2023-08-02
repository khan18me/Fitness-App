package com.example.fitness_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView exercise;
    private static final String PACKAGE_NAME_ANOTHER_APP = "com.fitnessfreak.onlinemusicplayer"; // Replace with the package name of the other app
    private static final String GOOGLE_DRIVE_DOWNLOAD_URL = "https://drive.google.com/file/d/1L0YhuKk_UumWswCEheCiTCdMBGid-ce5/view?usp=drive_link"; // Replace with the Google Drive download link

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

        RelativeLayout relativeLayout6 = findViewById(R.id.music);
        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMusicApp();
            }
        });



    }

    private void openMusicApp() {

        PackageManager pm = getPackageManager();
        Intent intent = pm.getLaunchIntentForPackage(PACKAGE_NAME_ANOTHER_APP);

        if (intent != null) {
            // The app exists on the device, so start the activity
            startActivity(intent);
        } else {
            // The app is not installed, so show the Google Drive download link in a web browser
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(GOOGLE_DRIVE_DOWNLOAD_URL));
            startActivity(browserIntent);
        }

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
