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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class LoginProfesor extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    private EditText profUsernameEditText;
    private EditText profPasswordEditText;
    private CardView profLoginButton;

    private CheckBox profesorCheckbox;
    private SharedPreferences profPrefrences;
    SharedPreferences.Editor editor;
    private static final String PREFS_NAME="PrefsFileProfesor";
    private static final String KEY_REMEMBER = "remember";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASS = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_profesor);

        bindWidget();
        addEventToWidget();

        profPrefrences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);



        CardView sendButton = (CardView) findViewById(R.id.loginProf);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoggedProfesor();
            }
        });

    }


    private void bindWidget(){

        profesorCheckbox = (CheckBox)findViewById(R.id.checkBoxProf);
        profUsernameEditText = (EditText)findViewById(R.id.editTextEmailProfesor);
        profPasswordEditText = (EditText)findViewById(R.id.editTextParolaProf);
        profLoginButton = (CardView)findViewById(R.id.loginProf);
    }

    private void addEventToWidget() {
        profPrefrences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = profPrefrences.edit();

        if(profPrefrences.getBoolean(KEY_REMEMBER,false)){
            profesorCheckbox.setChecked(true);
        }else{
            profesorCheckbox.setChecked(false);
        }
        profUsernameEditText.setText(profPrefrences.getString(KEY_USERNAME,""));
        profPasswordEditText.setText(profPrefrences.getString(KEY_PASS,""));

        profUsernameEditText.addTextChangedListener(this);
        profPasswordEditText.addTextChangedListener(this);
        profesorCheckbox.setOnCheckedChangeListener(this);
    }




    private void LoggedStudent(){
        Intent intent = new Intent(LoginProfesor.this, DashboardStudent.class);
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
        if(profesorCheckbox.isChecked()){
            editor.putString(KEY_USERNAME,profUsernameEditText.getText().toString().trim());
            editor.putString(KEY_PASS,profPasswordEditText.getText().toString().trim());
            editor.putBoolean(KEY_REMEMBER,true);
            editor.apply();
        }else{
            editor.putBoolean(KEY_REMEMBER,false);
            editor.remove(KEY_PASS);
            editor.remove(KEY_USERNAME);
            editor.apply();
        }
    }

    public void LoggedProfesor() {
        Intent intent = new Intent(LoginProfesor.this, DashboardProfesor.class);
        startActivity(intent);
    }
}

