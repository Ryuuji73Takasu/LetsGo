package com.mrhsourav54.letsgo.Translator.parser;

import android.support.annotation.NonNull;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


public class JSONparser {

    private static final String MAIN_URL = "https://script.google.com/macros/s/AKfycbxOLElujQcy1-ZUer1KgEvK16gkTLUqYftApjNCM_IRTL3HSuDk/exec?id=1Hh3gAFPJ88_uoxFwUvepen2YUCae0nxBEDixpZavX88&sheet=Sheet1";

    public static final String TAG = "TAG";

    private static final String KEY_USER_ID = "user_id";

    private static Response response;

    public static JSONObject getDataFromWeb() {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(MAIN_URL)
                    .build();
            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());
        } catch (@NonNull IOException | JSONException e) {
            Log.e(TAG, "" + e.getLocalizedMessage());
        }
        return null;
    }



    public static void getDataById(String userId) {

       /* try {
            OkHttpClient client = new OkHttpClient();

            RequestBody formBody = new FormEncodingBuilder()
                    .add(userId, "=GOOGLETRANSLATE(A1,\"auto\",\"bn\")").build();

            Request request = new Request.Builder()
                    .url(MAIN_URL)
                    .post(formBody)
                    .build();

            response = client.newCall(request).execute();
            return new JSONObject(response.body().string());

        } catch (IOException | JSONException e) {
            Log.e(TAG, "" + e.getLocalizedMessage());
        }
        return null;*/


       /* String reason = menuItem.getTitle().toString();
        if (reason.equals("Copyright"))
            reason = "CopyrightInfringement";
        JsonObject json = new JsonObject();
        json.addProperty("Reason", reason);

        String url = mBaseUrl + "/" + id + "/report";

        String jsonString = json.toString();
        RequestBody body = RequestBody.create(JSON, jsonString);

        Request request = new Request.Builder()
                .header("X-Client-Type", "Android")
                .url(url)
                .post(body)
                .build();

        client.newCall(request).enqueue(new com.squareup.okhttp.Callback() {
            @Override
            public void onFailure(Request request, IOException throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onResponse(Response response) throws IOException {
                if (!response.isSuccessful()) throw new IOException(
                        "Unexpected code " + response);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Report Received", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });*/

    }

}
