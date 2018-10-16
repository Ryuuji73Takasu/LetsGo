package com.mrhsourav54.letsgo.CurrencyConverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mrhsourav54.letsgo.R;

import static java.lang.Math.round;


public class Currency_conv extends AppCompatActivity {

    private Button btnEndorseYourCoy;
    private Button btnAgenciesCanHelp;
    private Button btnConvert;
    private CheckBox dollerTotaka;
    private CheckBox takaToDOller;
    private CheckBox euroToTaka;
    private CheckBox takaToEuro;
    private EditText txtGiveInput;
    private TextView txtViewResultsHere;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_conv);

        btnEndorseYourCoy = findViewById(R.id.endorseyourcoyID1);
        btnConvert = findViewById(R.id.convertID);
        btnAgenciesCanHelp = findViewById(R.id.findagenciescanhelpID);

        dollerTotaka = findViewById(R.id.dollertotakaID);
        takaToDOller = findViewById(R.id.takatodollerID);
        euroToTaka = findViewById(R.id.eurototakaID);
        takaToEuro = findViewById(R.id.takatoeuroID);
        txtGiveInput = findViewById(R.id.giveinputhereID);
        txtViewResultsHere = findViewById(R.id.yourresulthereID);


        btnAgenciesCanHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Currency_conv.this,viewAgencyDetail.class);
                startActivity(intent2);
            }
        });

        btnEndorseYourCoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Currency_conv.this,LoginCompany.class);
                        startActivity(intent1);
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {


                    String a = txtGiveInput.getText().toString();
                    double num = Double.parseDouble(a);
                    double ans;
                    txtViewResultsHere.setText("");

                    if (dollerTotaka.isChecked()) {
                        round(ans = 83.82 * num);
                        txtViewResultsHere.append(a + " Dollar = " + ans + " Taka\n");
                    }
                    if (takaToDOller.isChecked()) {
                        round(ans = num/83.82);
                        txtViewResultsHere.append(a + " Taka =" + ans + " Dollar\n");
                    }
                    if (euroToTaka.isChecked()) {
                        round(ans = num*96.75);
                        txtViewResultsHere.append(a + " Euro = " + ans + " Taka\n");
                    }
                    if (takaToEuro.isChecked()) {
                        round(ans = num/96.75);
                        txtViewResultsHere.append(a + " Taka = " + ans + " Euro\n");
                    }
                   
                }
                catch (Exception e)
                {
                    Toast.makeText(Currency_conv.this, "Please Enter a valid number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
