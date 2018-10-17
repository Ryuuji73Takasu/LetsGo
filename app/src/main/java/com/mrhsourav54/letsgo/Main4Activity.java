package com.example.murzuka.hotrl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button book_now21, book_now22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        book_now21=(Button)findViewById(R.id.book_now8);
        book_now22=(Button)findViewById(R.id.book_now9);

        book_now21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }

        });
        book_now22.setOnClickListener(new View.OnClickListener() {
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
