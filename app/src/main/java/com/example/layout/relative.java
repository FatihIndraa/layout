package com.example.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class relative extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        Button buttonLinear = findViewById(R.id.buttonlinear);
        Button buttonWrap = findViewById(R.id.buttonconstraint);

        buttonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relative.this, MainActivity.class);
                startActivity(intent);
            }
        });
        buttonWrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relative.this, constraint.class);
                startActivity(intent);
            }
        });


}}
