package com.stechlabs.chitchat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login,sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.button_1);
        sign_up=findViewById(R.id.button_2);
        login.setOnClickListener(this);
        sign_up.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button_1:{
                Toast.makeText(MainActivity.this,"CLicked",Toast.LENGTH_SHORT).show();

            }break;
            case R.id.button_2:{
                Toast.makeText(MainActivity.this,"CLicked_1",Toast.LENGTH_SHORT).show();
            }break;
        }
    }
}
