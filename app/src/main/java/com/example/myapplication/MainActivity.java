package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    android.widget.ListView ListView;
    Spinner combo, masa;

    public String namaKoruptor[] = {"-- pilih nama koruptor--", "Pinangki Sirna Malasari",
            "Mirawati", "Setyabudi Tejocahyono", "Sugiharto bin Isran",
            "Budi Susanto", "Danis Hatmaji", "Edy Nasutio"};
    public String masaTahanan[] = {"-- pilih masa tahanan --", "5 Tahun", "10 Tahun", "15 Tahun", "20 Tahun", "30 Tahun", "Seumur hidup"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = (ListView) findViewById(R.id.listKoruptor);
        combo = (Spinner) findViewById(R.id.comboKoruptor);
        masa = (Spinner) findViewById(R.id.masaKoruptor);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,namaKoruptor);
        combo.setAdapter(adapter);
        ArrayAdapter adapter2 = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,masaTahanan);
        masa.setAdapter(adapter2);
    }
}