package com.imanhkm.homeinventory56.activities;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.imanhkm.homeinventory56.R;

public class SignupActivity extends AppCompatActivity {

    EditText username = (EditText) findViewById(R.id.signup_screen_username_input);
    EditText password = (EditText) findViewById(R.id.signup_screen_password_input);
    EditText passwordConfirm = (EditText) findViewById(R.id.signup_screen_password_confirm);

    public void signup(View view){
        if(password.getText().toString().equals(passwordConfirm.getText().toString())){
            //Passwords Match

        }
        else{
            //Passwords Don't Match

        }


    }

}
