package com.ahmadfariz.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ahmadfariz.sqlite.dashboard.Kalkulator;
import com.ahmadfariz.sqlite.dashboard.Konversi;
import com.ahmadfariz.sqlite.dashboard.Kopi;
import com.ahmadfariz.sqlite.dashboard.Kuis;
import com.ahmadfariz.sqlite.dashboard.Rate;
import com.ahmadfariz.sqlite.dashboard.Transisi;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void rate(View view) {
        Intent rate= new Intent(Dashboard.this, Rate.class);
        startActivity(rate);
    }

    public void transisi(View view) {
        Intent transisi= new Intent(Dashboard.this, Transisi.class);
        startActivity(transisi);
    }

    public void konversi(View view) {
        Intent konversi= new Intent(Dashboard.this, Konversi.class);
        startActivity(konversi);
    }

    public void kopi(View view) {
        Intent kopi= new Intent(Dashboard.this, Kopi.class);
        startActivity(kopi);
    }

    public void kuis(View view) {
        Intent kuis= new Intent(Dashboard.this, Kuis.class);
        startActivity(kuis);
    }

    public void kalkulator(View view) {
        Intent kalkulator= new Intent(Dashboard.this, Kalkulator.class);
        startActivity(kalkulator);
    }
}