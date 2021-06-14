package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
private EditText txtit;
private Button cnopka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtit = findViewById(R.id.txt_text);
        cnopka = findViewById(R.id.btn_cnopka);


                cnopka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                Toast.makeText(SecondActivity.this,txtit.getText().toString(),Toast.LENGTH_LONG).show();
                intent.putExtra("text", txtit.getText().toString());
                startActivity(intent);
            }
        });
    }
}