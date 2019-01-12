package com.example.andre.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.andre.android.adapters.ReportAdapter;
import com.example.andre.android.model.RaportQuizz;

import java.util.ArrayList;
import java.util.List;

//import de.codecrafters.tableview.TableView;
//import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
//import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

import static android.content.ContentValues.TAG;

public class reports_table extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports_table);

    }
}
