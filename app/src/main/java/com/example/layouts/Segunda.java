package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String message = intent.getStringExtra("Dog");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.tvTexto);
        textView.setText(message);
    }
}
