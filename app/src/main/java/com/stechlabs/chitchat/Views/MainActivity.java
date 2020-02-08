package com.stechlabs.chitchat.Views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.stechlabs.chitchat.R;

public class MainActivity extends AppCompatActivity {

    Button login, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));
            }
        });


    }

    private void initView() {
        login = findViewById(R.id.button_1);
        sign_up = findViewById(R.id.button_2);
    }

}
