package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button B;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.editTextTextPersonName);
        n2 = findViewById(R.id.editTextTextPersonName2);
        B = findViewById(R.id.button);
        text= findViewById(R.id.textView);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fog = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                text.setText("result: "+ fog);

            }
        });
    }
}