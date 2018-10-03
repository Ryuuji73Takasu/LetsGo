package com.mrhsourav54.letsgo.Transport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.mrhsourav54.letsgo.Homepage;
import com.mrhsourav54.letsgo.R;

public class TransportRental extends AppCompatActivity {

    private ImageButton hm;
    private Button carbtn;
    private Button planebtn;
    private Button trainbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_rental);
        hm = findViewById(R.id.homeButton3);
        carbtn = findViewById(R.id.car);
        planebtn = findViewById(R.id.plane);
        trainbtn = findViewById(R.id.train);

        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii = new Intent(TransportRental.this,Homepage.class);
                startActivity(iii);
            }
        });

        carbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii2 = new Intent(TransportRental.this,CarRental.class);
                startActivity(iii2);
            }
        });
        planebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii3 = new Intent(TransportRental.this,PlaneFare.class);
                startActivity(iii3);
            }
        });
        trainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii4 = new Intent(TransportRental.this,TrainTickets.class);
                startActivity(iii4);
            }
        });


    }
}
