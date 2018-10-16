package com.mrhsourav54.letsgo.Transport.Train;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.mrhsourav54.letsgo.R;

public class TicketTiming extends AppCompatActivity {

    private TextView testing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_timing);

        testing = findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        String depstat = bundle.getString("a1");
        String arrstat = bundle.getString("a2");

        testing.setText(depstat+arrstat);




    }
}
