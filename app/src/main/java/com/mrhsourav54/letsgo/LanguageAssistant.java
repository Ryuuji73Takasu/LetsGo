package com.mrhsourav54.letsgo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mrhsourav54.letsgo.parser.JSONparser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LanguageAssistant extends AppCompatActivity {

    private ImageButton homepagebtn;
    private EditText etin;
    private TextView tvout;
    private String in;
    private JSONObject out;
    private Button cnv;
   /* private String jsonin;
    private JSONObject j;
    private JSONObject sout;*/


    @TargetApi(Build.VERSION_CODES.KITKAT)
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
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

/*       try {
            jsonin = "{\"first\":\""+in+"\"}";
            JSONObject jsonObject = new JSONObject(jsonin );
            //getting specific key values
            Log.d("first = ", jsonObject.getString(in));*/


        /*}catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            j = new JSONObject(jsonin);
        } catch (JSONException e) {
            e.printStackTrace();
        }


*/

  //      tvout.setText("");

        JSONparser.getDataById(in);

        out = JSONparser.getDataFromWeb();


        /*JSONArray arr = null;
        try {
            arr = new JSONArray(out);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jObj = null;
        try {
            jObj = arr.getJSONObject(0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            String date = jObj.getString("hello");
        } catch (JSONException e) {
            e.printStackTrace();
        }*/

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
