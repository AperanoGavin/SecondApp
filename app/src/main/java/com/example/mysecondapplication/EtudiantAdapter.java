package com.example.mysecondapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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

        if(view==null){
            LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.row, null);
        }
        TextView tv_n = view.findViewById(R.id.tv_nom);
        TextView tv_p = view.findViewById(R.id.tv_prenom);

        Etudiant current = (Etudiant) getItem(i);
        tv_n.setText(current.getNom());
        tv_p.setText(current.getPrenom());

        return view;
    }
}
