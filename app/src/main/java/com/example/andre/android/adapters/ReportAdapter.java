package com.example.andre.android.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.andre.android.R;
import com.example.andre.android.model.RaportQuizz;

import java.util.ArrayList;

public class ReportAdapter extends ArrayAdapter<RaportQuizz> {
    private static final String TAG="QuizzesListAdapter";
    private Context mContext;
    int mResource;

    public ReportAdapter(Context context, int resource, ArrayList<RaportQuizz> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String nume=getItem(position).getNumeTestR();
        String cod=getItem(position).getCodTestR();
        String punctaj=getItem(position).getPunctaj();
        String materie = getItem(position).getMaterie();

        RaportQuizz q1=new RaportQuizz(  nume,cod, punctaj,materie);
        LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent,false);

        TextView tvtN=(TextView)convertView.findViewById(R.id.tvNumeRaport);
        TextView tvtC=(TextView)convertView.findViewById(R.id.tvCodTextRaport);
        TextView tvtP=(TextView)convertView.findViewById(R.id.tvPunctaj);
        TextView tvM = (TextView)convertView.findViewById(R.id.tvMaterie);

        tvtN.setText(nume);
        tvtC.setText(cod);
        tvtP.setText(punctaj);
        tvM.setText(materie);

        return convertView;
    }
}
