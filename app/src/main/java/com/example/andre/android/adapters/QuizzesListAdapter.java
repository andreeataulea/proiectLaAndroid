package com.example.andre.android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.andre.android.R;
import com.example.andre.android.model.Intrebare;
import com.example.andre.android.model.Quizz;

import java.util.ArrayList;

public class QuizzesListAdapter extends ArrayAdapter<Quizz> {

    private static final String TAG="QuizzesListAdapter";
    private Context mContext;
    int mResources;


    public QuizzesListAdapter(Context context, int resource, ArrayList<Quizz>objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResources = resource;
    }

    @Override
    public View getView(int position,View covertView, ViewGroup parent) {
        String nume= getItem(position).getNumeTest();
        String cod=getItem(position).getCodTest();
        String tip=getItem(position).getTipTest();

        Quizz q1=new Quizz(nume,cod,tip);
        LayoutInflater inflater=LayoutInflater.from(mContext);
        covertView=inflater.inflate(mResources,parent,false);
        TextView tvtN=(TextView)covertView.findViewById(R.id.tvNumeAdapter);
        TextView tvtC=(TextView)covertView.findViewById(R.id.tvCodAdapter);
        TextView tvtT=(TextView)covertView.findViewById(R.id.tvTipAdapter);

        tvtN.setText(nume);
        tvtC.setText(cod);
        tvtT.setText(tip);

        return  covertView;
    }
}
