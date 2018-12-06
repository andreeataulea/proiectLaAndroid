package com.example.andre.android;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class RegisterStudent extends AppCompatActivity {

    Button selectDate;
    TextView date;
    DatePickerDialog datePickerDialogStudent;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_student);
        selectDate = findViewById(R.id.buttonDataStudent);

        selectDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                date = findViewById(R.id.tvDateStudent);
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialogStudent = new DatePickerDialog(RegisterStudent.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        date.setText(day + "/" + month + "/" + year);
                    }
                },year, month, dayOfMonth);

                datePickerDialogStudent.show();
            }


        });
    }
}
