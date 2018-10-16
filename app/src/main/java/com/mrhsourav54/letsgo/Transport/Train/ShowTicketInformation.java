package com.mrhsourav54.letsgo.Transport.Train;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mrhsourav54.letsgo.R;

public class ShowTicketInformation extends AppCompatActivity {
    private TextView lekhapora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_ticket_information);
    lekhapora = findViewById(R.id.textView3);


    }
}
