package com.example.controlecc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class modifier extends AppCompatActivity {

    EditText nom,se,nb;
    Button update,delete;
    Spinner cmb;
    MyDatabase db;
    ArrayList<Societe> s;
    ArrayAdapter<String> ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier);

        db=new MyDatabase(this);
        cmb=findViewById(R.id.cb);
        nom=findViewById(R.id.txt_nom2);
        se=findViewById(R.id.txt_sec2);
        nb=findViewById(R.id.txt_nb2);
        update=findViewById(R.id.btn_up);
        delete=findViewById(R.id.btn_del);
        s=MyDatabase.getAllSociete(db.getReadableDatabase());
        ArrayList<String> lst=new ArrayList<>();
        for (Societe s:s){
            lst.add(String.valueOf(s.getId()));
        }
        ad=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,lst);
        cmb.setAdapter(ad);

        cmb.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}