package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {
    private Button book_now41, book_now42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        book_now41=(Button)findViewById(R.id.book_now10);
        book_now42=(Button)findViewById(R.id.book_now11);


        book_now41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        book_now42.setOnClickListener(new View.OnClickListener() {
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
