package com.example.andre.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.andre.android.model.Intrebare;
import com.example.andre.android.model.Quizz;

import java.util.ArrayList;

public class create_quizz_layout extends Activity {
    private Button adaugaIntrebare;
    private ArrayList<String> intrebariList=new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private Spinner materieS;
    private TextView nume;
    private TextView cod;
    private TextView tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quizz_layout);

        adaugaIntrebare=(Button)findViewById(R.id.adaugaIntrebareButton);
        adaugaIntrebare.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openCreareIntrebare();
            }
        });
        nume=(TextView)findViewById(R.id.numeTextView);
        cod=(TextView)findViewById(R.id.codTextView);
        tip=(TextView)findViewById(R.id.tipTextView);
        materieS=findViewById(R.id.spinnerMaterie);
        adapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,intrebariList);
        materieS.setAdapter(adapter);
        materieS.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((TextView)parent.getChildAt(0)).setTextColor(Color.BLACK);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1&&requestCode==RESULT_OK){
            Intrebare newIntrebare=(Intrebare)data.getSerializableExtra("intrebare");
            intrebariList.add(newIntrebare.toString());
            if(adapter!=null){
                adapter.notifyDataSetChanged();
            }
        }
    }

    public void openCreareIntrebare(){
        Intent intent = new Intent(this, com.example.andre.android.creare_intrebare.class);
        startActivity(intent);
    }

    public void adaugaQuizz(View view){
        if("".equals(nume.getText().toString())){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("Numele este obligatoriu!");
            builder.setPositiveButton("OK",null);
            AlertDialog dialog = builder.create();
            dialog.show();
        }else{
            Quizz newQuizz=new Quizz(nume.getText().toString(),cod.getText().toString(),tip.getText().toString());
            Intent intent=new Intent();
            intent.putExtra("quizz",newQuizz);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}
