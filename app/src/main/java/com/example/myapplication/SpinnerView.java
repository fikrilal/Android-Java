package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class SpinnerView extends AppCompatActivity {

    ListView ListView;
    Spinner combo;

    public String namaKoruptor[] = {"Pinangki Sirna Malasari",
            "Mirawati", "Setyabudi Tejocahyono", "Sugiharto bin Isran",
            "Budi Susanto", "Danis Hatmaji", "Edy Nasutio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_view);

        ListView = (ListView) findViewById(R.id.listKoruptor);
        combo = (Spinner) findViewById(R.id.comboKoruptor);

        ArrayAdapter adapter = new ArrayAdapter(SpinnerView.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,namaKoruptor);
        combo.setAdapter(adapter);
    }
}