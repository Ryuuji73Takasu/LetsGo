package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm4 extends AppCompatActivity {
private Button btn_khulna1,btn_khulna2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa4);
     btn_khulna1=(Button) findViewById(R.id.btnk1);
      btn_khulna2=(Button) findViewById(R.id.btnk2);

   btn_khulna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }

        });
       btn_khulna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }

        });

    }
    public void openActivity12(){
        Intent intent=new Intent(this,mm12.class);
        startActivity(intent);
    }

    public void openActivity13(){
        Intent intent=new Intent(this,mm13.class);
        startActivity(intent);
    }
}
