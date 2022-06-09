package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt_contenu;
    private  Button btn_save;
    private Button btn_load;

    private SharedPreferences shp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn_load=findViewById(R.id.btn_load);
        this.btn_save=findViewById(R.id.btn_save);
        this.edt_contenu=findViewById(R.id.edt_contenu);
        this.shp= getSharedPreferences("valeurs", MODE_PRIVATE);

        this.btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}