package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
    private Button book_now51, book_now52;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        book_now51=(Button)findViewById(R.id.book_now12);
        book_now52=(Button)findViewById(R.id.book_now13) ;




        book_now51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        book_now52.setOnClickListener(new View.OnClickListener() {
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
