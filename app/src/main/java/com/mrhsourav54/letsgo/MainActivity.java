package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnmain1,btnmain2,btnmain3,btnmain4,btnmain5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmain1= (Button) findViewById(R.id.btnh1);
        btnmain2= (Button) findViewById(R.id.btnc1);
        btnmain3=(Button) findViewById(R.id.btnk1) ;
        btnmain4=(Button) findViewById(R.id.btnr1) ;
        btnmain5=(Button) findViewById(R.id.btns1) ;

        btnmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }

        });
        btnmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }

        });
        btnmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }

        });
        btnmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }

        });
        btnmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }

        });
    }

    public void openActivity2(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent=new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void openActivity6(){
        Intent intent=new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
    public void openActivity7(){
        Intent intent=new Intent(this,Main7Activity.class);
        startActivity(intent);
    }
}
