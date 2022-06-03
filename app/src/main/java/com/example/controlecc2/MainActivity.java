package com.example.controlecc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {

        Intent i=null;
        switch(view.getId()){
            case R.id.btn_aj: i=new Intent(MainActivity.this,ajouter.class);break;
            case R.id.btn_ed: i=new Intent(MainActivity.this,editer.class);break;
            case R.id.btn_li: i=new Intent(MainActivity.this,lister.class);break;
        }
        startActivity(i);
    }
}





