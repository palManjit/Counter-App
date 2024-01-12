package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.sax.SAXResult;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn_increment,btn_decrement,btn_restart;
    int count=0;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        btn_increment = findViewById(R.id.btn_increment);
        btn_decrement=findViewById(R.id.btn_decrement);
        btn_restart=findViewById(R.id.btn_restart);


        btn_increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                editText.setText(" "+count);
            }
        });
        btn_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                editText.setText(" "+count);
            }
        });
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count =0;
                editText.setText(" "+count);
            }
        });
    }
}