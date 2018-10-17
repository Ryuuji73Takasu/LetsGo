package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm2 extends AppCompatActivity {
private Button btn_dhaka1,btn_dhaka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa2);
        btn_dhaka1=(Button) findViewById(R.id.btnd1);
        btn_dhaka2=(Button) findViewById(R.id.btnd2);

        btn_dhaka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }

        });
        btn_dhaka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }

        });

    }

    public void openActivity7(){
        Intent intent=new Intent(this,mm7.class);
        startActivity(intent);
    }

    public void openActivity8(){
        Intent intent=new Intent(this,mm8.class);
        startActivity(intent);
    }
}
