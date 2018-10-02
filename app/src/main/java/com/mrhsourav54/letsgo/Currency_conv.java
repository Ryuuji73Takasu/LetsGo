package com.mrhsourav54.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


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
                    //tvinfo.setText("");

                    if (dollerTotaka.isChecked()) {
                        ans = 80 * num;
                        txtViewResultsHere.append(a + " Doller = " + ans + " Taka.\n");
                    }
                    if (takaToDOller.isChecked()) {
                        ans = num/80;
                        txtViewResultsHere.append(a + " Taka =" + ans + " Doller.\n");
                    }
                    if (euroToTaka.isChecked()) {
                        ans = num*120;
                        txtViewResultsHere.append(a + " Euro = " + ans + " Taka.\n");
                    }
                    if (takaToEuro.isChecked()) {
                        ans = num/120;
                        txtViewResultsHere.append(a + " Taka = " + ans + " Euro.\n");
                    }
                   
                }
                catch (Exception e)
                {
                    Toast.makeText(Currency_conv.this, "Please Enter a number at first", Toast.LENGTH_SHORT).show();

                }

            }
        });



    }
}
