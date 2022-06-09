package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public List<Etudiant> getDataSource(){
        List<Etudiant> resultat = new ArrayList<>();
        resultat.add(new Etudiant(18,"Gaveen", "Bob"));
        resultat.add(new Etudiant(18,"Gaveen", "Bob"));
        resultat.add(new Etudiant(18,"Gaveen", "Bob"));

        return resultat;
    }
}