package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import com.example.layout.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button saveInternal, buttonPindah;
    private EditText nim, nama;
    private TextView hnim, hnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = findViewById(R.id.inputData);
        nama = findViewById(R.id.inputData1);
        hnim = findViewById(R.id.hasilNim);
        hnama = findViewById(R.id.hasilNama);
        saveInternal = findViewById(R.id.saveInternal);
        buttonPindah = findViewById(R.id.buttonPindah);

        saveInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xnim = nim.getText().toString().trim();
                String xnama = nama.getText().toString().trim();

                hnim.setText(xnim);
                hnama.setText(xnama);
            }
        });

        buttonPindah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonPindah) {
            Intent intent = new Intent(MainActivity.this, relative.class);
            startActivity(intent);
        }
    }
}
