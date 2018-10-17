package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button book_now11, book_now12, book_now13, book_now14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        book_now11=(Button)findViewById(R.id.book_now);
        book_now12=(Button)findViewById(R.id.book_now2);
        book_now13=(Button)findViewById(R.id.book_now3);
        book_now14=(Button)findViewById(R.id.book_now4) ;




        book_now11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
      book_now12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
 book_now13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
    book_now14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
}


    public void openActivity3(){
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    }

