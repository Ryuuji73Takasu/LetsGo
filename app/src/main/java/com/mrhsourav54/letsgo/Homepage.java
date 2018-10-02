package com.mrhsourav54.letsgo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Hashtable;


public class Homepage extends AppCompatActivity {
    private ImageButton homepagebtn;
    private Button htlbkngbtn;
    private Button carrentbtn;
    private Button currconvbtn;
    private Button langassbtn;
    private Button cmprhotelbtn;
    private Button placesbtn;
    private Button emergebtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Remove title bar

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_homepage);

        homepagebtn = findViewById(R.id.homeButton);
        htlbkngbtn = findViewById(R.id.hotel);
        carrentbtn = findViewById(R.id.rental);
        currconvbtn = findViewById(R.id.currency);
        langassbtn = findViewById(R.id.language);
        cmprhotelbtn = findViewById(R.id.cmprhotel);
        placesbtn = findViewById(R.id.places);
        emergebtn = findViewById(R.id.emergency);

        addListenerOnButton();
    }
    public void addListenerOnButton(){

        homepagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(Homepage.this,"Home button clicked.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
