package com.example.mysecondapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class EtudiantAdapter extends BaseAdapter {

    private List<Etudiant> contenu;
    private Context context;

    public EtudiantAdapter(List<Etudiant> contenu, Context context){
        this.contenu= contenu;
        this.context= context;
    }

    @Override
    public int getCount() {
        return this.contenu.size();
    }

    @Override
    public Object getItem(int i) {
        return this.contenu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
