package com.mrhsourav54.letsgo.Transport.Train;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mrhsourav54.letsgo.R;

public class TrainTickets extends AppCompatActivity {
    private EditText depstat;
    private EditText arrstat;
    private Button showClassInfo;
    private Button confbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_tickets);
        showClassInfo = findViewById(R.id.viewtraininfo);
        confbtn = findViewById(R.id.confirm);
        depstat = findViewById(R.id.from);
        arrstat = findViewById(R.id.to);

        showClassInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iiila = new Intent(TrainTickets.this, ShowTicketInformation.class);
                startActivity(iiila);
            }
        });
        confbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (depstat.getText().toString() == "" && arrstat.getText().toString() == "") {
                    Toast.makeText(TrainTickets.this, "Write station name!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent iila = new Intent(TrainTickets.this, TicketTiming.class);
                    iila.putExtra("a1",depstat.getText().toString());
                    iila.putExtra("a2",arrstat.getText().toString());
                    startActivity(iila);




                }
            }

        });

    }
}