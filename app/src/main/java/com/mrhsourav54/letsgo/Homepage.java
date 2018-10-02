package com.mrhsourav54.letsgo;


import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;



public class Homepage extends AppCompatActivity {

    private Button btnCurrencyConverter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);



        btnCurrencyConverter= findViewById(R.id.currencyConverterID);



        btnCurrencyConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this,Currency_conv.class);
                startActivity(intent);
            }
        });
    }
}
