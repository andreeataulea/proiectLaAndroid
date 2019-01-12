package com.example.andre.android;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LoginStudent extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    public static final  String Extra_nume = "com.example.andre.android.Extra_nume";

    private EditText studUsernameEditText;
    private EditText studPasswordEditText;
    private CardView studLoginButton;

    private CheckBox studentCheckbox;
    private SharedPreferences studPrefrences;
    SharedPreferences.Editor editor;
    private static final String PREFS_NAME="PrefsFileStudent";
    private static final String KEY_REMEMBER = "remember";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASS = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);
        bindWidget();
        addEventToWidget();

        studPrefrences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);



        CardView sendButton = (CardView) findViewById(R.id.loginStud);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoggedStudent();
            }
        });

    }


    private void bindWidget(){

        studentCheckbox = (CheckBox)findViewById(R.id.checkBoxStud);
        studUsernameEditText = (EditText)findViewById(R.id.editTextStudent);
        studPasswordEditText = (EditText)findViewById(R.id.editTextParolaStud);
        studLoginButton = (CardView)findViewById(R.id.loginStud);
    }

    private void addEventToWidget() {
        studPrefrences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = studPrefrences.edit();

        if(studPrefrences.getBoolean(KEY_REMEMBER,false)){
            studentCheckbox.setChecked(true);
        }else{
            studentCheckbox.setChecked(false);
        }
        studUsernameEditText.setText(studPrefrences.getString(KEY_USERNAME,""));
        studPasswordEditText.setText(studPrefrences.getString(KEY_PASS,""));

        studUsernameEditText.addTextChangedListener(this);
        studPasswordEditText.addTextChangedListener(this);
        studentCheckbox.setOnCheckedChangeListener(this);
    }




    private void LoggedStudent(){
        Intent intent = new Intent(LoginStudent.this, DashboardStudent.class);
        startActivity(intent);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        managePrefs();
    }



    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        managePrefs();
    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    private void managePrefs() {
        if(studentCheckbox.isChecked()){
            editor.putString(KEY_USERNAME,studUsernameEditText.getText().toString().trim());
            editor.putString(KEY_PASS,studPasswordEditText.getText().toString().trim());
            editor.putBoolean(KEY_REMEMBER,true);
            editor.apply();
        }else{
            editor.putBoolean(KEY_REMEMBER,false);
            editor.remove(KEY_PASS);
            editor.remove(KEY_USERNAME);
            editor.apply();
        }
    }
}
