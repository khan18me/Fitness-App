package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class shop extends AppCompatActivity {

    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        View equipment = findViewById(R.id.equipment);
        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equipmentproducts();
            }
            private void equipmentproducts() {
                String equipmentProductLink = "https://www.amazon.in/s?k=gym+equipments&crid=1WBFHJ4EJHCFV&sprefix=gym+equipment%2Caps%2C396&ref=nb_sb_noss_1";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(equipmentProductLink));
                startActivity(intent);
            }
        });

        View protein = findViewById(R.id.protein);
        protein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proteinproducts();
            }
            private void proteinproducts() {
                String equipmentProductLink = "https://www.amazon.in/s?k=protein+powder&crid=15HXHDHDZGIZ5&sprefix=%2Caps%2C1140&ref=nb_sb_ss_recent_2_0_recent";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(equipmentProductLink));
                startActivity(intent);
            }
        });

        View gymwear = findViewById(R.id.gymwear);
        gymwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymwearproducts();
            }
            private void gymwearproducts() {
                String equipmentProductLink = "https://www.amazon.in/s?k=gym+wear+for+men&sprefix=gym+wea%2Caps%2C404&ref=nb_sb_ss_ts-doa-p_2_7";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(equipmentProductLink));
                startActivity(intent);
            }
        });

        View fitnessdevice = findViewById(R.id.fitnessdevice);
        fitnessdevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fitnessdeviceproducts();
            }
            private void fitnessdeviceproducts() {
                String equipmentProductLink = "https://www.amazon.in/s?k=fitness+devices&crid=1HUHWGDOXNDSG&sprefix=fitness+devices%2Caps%2C438&ref=nb_sb_noss_1";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(equipmentProductLink));
                startActivity(intent);
            }
        });


    }
}