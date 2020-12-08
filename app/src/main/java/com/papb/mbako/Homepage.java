package com.papb.mbako;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class Homepage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp_pasar_home;
    Button btn_beras;
    Button btn_telur;
    Button btn_susu;
    Button btn_garam;
    Button btn_gula;
    Button btn_minyak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //identifikasi
        sp_pasar_home = findViewById(R.id.sp_pasar_home);
        btn_beras = findViewById(R.id.btn_beras);
        btn_telur = findViewById(R.id.btn_telur);
        btn_susu = findViewById(R.id.btn_susu);
        btn_garam = findViewById(R.id.btn_garam);
        btn_gula = findViewById(R.id.btn_gula);
        btn_minyak = findViewById(R.id.btn_minyak);

        btn_beras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beras = new Intent(Homepage.this, BerasActivity.class);
                startActivity(beras);
                finish();
            }
        });

        btn_telur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telur = new Intent(Homepage.this, TelurActivity.class);
                startActivity(telur);
                finish();
            }
        });

        btn_garam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent garam = new Intent(Homepage.this, GaramActivity.class);
                startActivity(garam);
            }
        });

        btn_susu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent susu = new Intent(Homepage.this, SusuActivity.class);
                startActivity(susu);
            }
        });


        //pas masukin (this); dalam OnItemSelected jangan lupa untuk implements AdapterView.OnItemSelectedListener
        //terus di implement methodsnya
        sp_pasar_home.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
