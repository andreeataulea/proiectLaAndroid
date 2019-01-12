package com.example.andre.android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.andre.android.R;
import com.example.andre.android.model.Intrebare;
import com.example.andre.android.model.Quizz;

import java.util.ArrayList;
import java.util.List;

public class QuizzesListAdapter extends BaseAdapter {


    private Context mContext;
    private List<Quizz> mQuizzes;

    public QuizzesListAdapter(Context context,List<Quizz>mQuizzes) {
        this.mContext = context;
        this.mQuizzes = mQuizzes;

    }

    @Override
    public int getCount() {
        return mQuizzes.size();
    }

    @Override
    public Object getItem(int position) {
        return mQuizzes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position,View covertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.adapter_view_quizz,null);

        TextView tvtN=(TextView)v.findViewById(R.id.tvNumeAdapter);
        TextView tvtC=(TextView)v.findViewById(R.id.tvCodAdapter);
        TextView tvtT=(TextView)v.findViewById(R.id.tvTipAdapter);
        TextView tvtM=(TextView)v.findViewById(R.id.tvMaterieAdapter);

        tvtN.setText(mQuizzes.get(position).getNumeTest());
        tvtC.setText(mQuizzes.get(position).getCodTest());
        tvtT.setText(mQuizzes.get(position).getTipTest());
        tvtM.setText(mQuizzes.get(position).getMaterie());

        v.setTag(mQuizzes.get(position).getCodTest());

        return  v;
    }
}
