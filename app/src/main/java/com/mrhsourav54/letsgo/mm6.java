package com.example.murzuka.place;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm6 extends AppCompatActivity {
private Button btn_syl1,btn_syl2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa6);
       btn_syl1=(Button) findViewById(R.id.btns1);
      btn_syl2=(Button) findViewById(R.id.btns2);

   btn_syl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }

        });
   btn_syl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }

        });
    }

    public void openActivity15(){
        Intent intent=new Intent(this,mm15.class);
        startActivity(intent);
    }

    public void openActivity14(){
        Intent intent=new Intent(this,mm14.class);
        startActivity(intent);
    }
}
