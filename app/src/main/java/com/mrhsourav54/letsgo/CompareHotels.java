package com.mrhsourav54.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CompareHotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spn1;
    private Spinner spn2;
    private Button btnFindBestDeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_hotels);

        spn1 = findViewById(R.id.spinner1);
        spn2 = findViewById(R.id.spinner2);
        btnFindBestDeal = findViewById(R.id.findthebestdealID);

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.hotels_name,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn1.setAdapter(adapter);
        spn1.setOnItemSelectedListener(this);

        spn2.setAdapter(adapter);
        spn2.setOnItemSelectedListener(this);

        btnFindBestDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spn1Val = spn1.getSelectedItem().toString();
                String spn2Val = spn2.getSelectedItem().toString();

                if (spn1Val.equals("Radisson") && spn2Val.equals("Westin"))
                {
                    Intent i = new Intent(CompareHotels.this,radToWestin.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Radisson") && spn2Val.equals("Platinum Suites"))
                {
                    Intent i = new Intent(CompareHotels.this,rad_to_platinumSuites.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Radission") && spn2Val.equals("Sheraton"))
                {
                    Intent i = new Intent(CompareHotels.this,radission_to_sheraton.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Radission") && spn2Val.equals("Lakeshore"))
                {
                    Intent i = new Intent(CompareHotels.this,rad_to_lakeshore.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Westin") && spn2Val.equals("Radission"))
                {
                    Intent i = new Intent(CompareHotels.this,radToWestin.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Platinum Suites") && spn2Val.equals("Radission"))
                {
                    Intent i = new Intent(CompareHotels.this,rad_to_platinumSuites.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Sheraton") && spn2Val.equals("Radission"))
                {
                    Intent i = new Intent(CompareHotels.this,radission_to_sheraton.class);
                    startActivity(i);
                }

                if (spn1Val.equals("Lakeshore") && spn2Val.equals("Radission"))
                {
                    Intent i = new Intent(CompareHotels.this,rad_to_lakeshore.class);
                    startActivity(i);
                }

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
