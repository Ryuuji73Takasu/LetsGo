package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm3 extends AppCompatActivity {
private Button btn_ctg1,btn_ctg2,btn_ctg3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa3);
        btn_ctg1=(Button) findViewById(R.id.btnc1);
        btn_ctg2=(Button) findViewById(R.id.btnc3);
        btn_ctg3=(Button) findViewById(R.id.btnc4);

     btn_ctg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity9();
            }

        });
        btn_ctg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }

        });
        btn_ctg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }

        });
    }
    public void openActivity9(){
        Intent intent=new Intent(this,mm9.class);
        startActivity(intent);
    }

    public void openActivity11(){
        Intent intent=new Intent(this,mm11.class);
        startActivity(intent);
    }
    public void openActivity10(){
        Intent intent=new Intent(this,mm10.class);
        startActivity(intent);
    }
}
