package com.mrhsourav54.letsgo;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mrhsourav54.letsgo.parser.JSONparser;

import org.json.JSONException;
import org.json.JSONObject;

public class LanguageAssistant extends AppCompatActivity {

    private ImageButton homepagebtn;
    private EditText etin;
    private TextView tvout;
    private String in;
    private JSONObject out;
    private Button cnv;
    private String jsonin;
    private JSONObject j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_assistant);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);

        homepagebtn = findViewById(R.id.homeButton2);
        etin = findViewById(R.id.intxt);
        tvout = findViewById(R.id.outtxt);
        cnv= findViewById(R.id.convbtn);
        in = etin.toString().trim();

     /*   try {
            jsonin = "{\"first\":\""+in+"\"}";
            JSONObject jsonObject = new JSONObject(jsonin );
            //getting specific key values
            Log.d("first = ", jsonObject.getString(in));
*/
        /*}catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            j = new JSONObject(jsonin);
        } catch (JSONException e) {
            e.printStackTrace();
        }

*/
        tvout.setText("");
        cnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONparser.getDataById(in);
                out = JSONparser.getDataFromWeb();
                tvout.setText(out.toString());

            }
        });
        JSONparser.getDataById(in);
        out = JSONparser.getDataFromWeb();

        tvout.setText(out.toString());

       /* try {
            out = j.getJSONObject("first");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        */






        homepagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(LanguageAssistant.this,Homepage.class);
                startActivity(i2);
            }
        });


    }
}
