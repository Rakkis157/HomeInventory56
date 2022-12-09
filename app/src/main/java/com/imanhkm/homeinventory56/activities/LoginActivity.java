package com.imanhkm.homeinventory56.activities;

import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.imanhkm.homeinventory56.R;

public class LoginActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance("https://home-inventory-8ff6b-default-rtdb.asia-southeast1.firebasedatabase.app/");
    DatabaseReference myRef = database.getReference("message");



    EditText username = (EditText) findViewById(R.id.signup_screen_username_input);
    EditText password = (EditText) findViewById(R.id.signup_screen_password_input);

    public void login(View view){



        if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234")){

        }
        else{

        }
    }

}
