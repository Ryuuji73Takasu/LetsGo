package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    private Button book_now31, book_now32, book_now33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        book_now31=(Button)findViewById(R.id.book_now5);
        book_now32=(Button)findViewById(R.id.book_now6);
        book_now33=(Button)findViewById(R.id.book_now7);


        book_now31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        book_now32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        book_now33.setOnClickListener(new View.OnClickListener() {
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
