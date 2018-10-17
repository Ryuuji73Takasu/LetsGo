package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm1 extends AppCompatActivity {
private Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa1);
        btn1= (Button) findViewById(R.id.btnnew1);
        btn2=(Button) findViewById(R.id.btnnew2);
        btn3=(Button) findViewById(R.id.btnnew3);
        btn4=(Button) findViewById(R.id.btnnew4);
        btn5=(Button) findViewById(R.id.btnnew5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }

        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }

        });




    }
    public void openActivity2(){
      Intent intent=new Intent(this,mm2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent=new Intent(this,mm3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent=new Intent(this,mm4.class);
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent=new Intent(this,mm5.class);
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent=new Intent(this,mm6.class);
        startActivity(intent);
    }


}


