package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm5 extends AppCompatActivity {
private Button btn_raj1,btn_raj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa5);
        btn_raj1=(Button) findViewById(R.id.btnr1);
        btn_raj2=(Button) findViewById(R.id.btnr2);
       btn_raj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }

        });
     btn_raj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }

        });
    }
    public void openActivity17(){
        Intent intent=new Intent(this,mm17.class);
        startActivity(intent);
    }

    public void openActivity16(){
        Intent intent=new Intent(this,mm16.class);
        startActivity(intent);
    }
}
