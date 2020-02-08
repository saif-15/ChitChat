package com.stechlabs.chitchat.Views;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import com.stechlabs.chitchat.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        Integer[] days=new Integer[]{1,2,3,4,5,6,7,8,9};

        AppCompatSpinner spinner=findViewById(R.id.day_spinner);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
}
