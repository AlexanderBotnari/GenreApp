package com.example.genreapp;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                if(isChecked){
                    button.setText("Male");
                    button.setTextColor(Color.BLUE);
                }
                if (!isChecked){
                    button.setText("Female");
                    button.setTextColor(Color.RED);
                }
            }
        });
    }
}