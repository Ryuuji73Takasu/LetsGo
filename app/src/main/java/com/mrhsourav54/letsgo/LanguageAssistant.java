package com.mrhsourav54.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LanguageAssistant extends AppCompatActivity {

    private ImageButton homepagebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_assistant);

        homepagebtn = findViewById(R.id.homeButton2);

        homepagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LanguageAssistant.this,Homepage.class);
                startActivity(i);
            }
        });
    }
}
