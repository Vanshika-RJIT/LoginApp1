package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.editText1);
        t2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText().toString().equals("7974025521")||t1.getText().toString().equals("vanshikasikarwar79@gmail.com")&&t2.getText().toString().equals("123456"))
                {
                    Toast.makeText(getApplicationContext(),"Successfully logged in",Toast.LENGTH_LONG).show();
                    //Intent i =new Intent(MainActivity.this,SecondActivity.class);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"your email or password is incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}