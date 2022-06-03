package com.example.controlecc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ajouter extends AppCompatActivity {
    EditText nom,secteur,nb;
    Button btnajou;
    MyDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajouter);


        db=new MyDatabase(this);
        btnajou=findViewById(R.id.btn_aj);
        View btnreturn = findViewById(R.id.btn_cancelNewS);
        nom=findViewById(R.id.txt_nom);
        secteur=findViewById(R.id.txt_secteur);
        nb=findViewById(R.id.txt_nb);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnajou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Societe s=new Societe(nom.getText().toString(),secteur.getText().toString(),Integer.valueOf(nb.getText().toString()));
                if(MyDatabase.AddSociete(db.getWritableDatabase(),s)==-1)
                    Toast.makeText(ajouter.this, "Cannot add to database", Toast.LENGTH_SHORT).show();
                else Toast.makeText(ajouter.this, "Added successfuly", Toast.LENGTH_SHORT).show();
            }
        });
    }
}