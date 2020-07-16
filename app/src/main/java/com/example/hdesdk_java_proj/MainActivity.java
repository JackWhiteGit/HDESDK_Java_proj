package com.example.hdesdk_java_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.sdk.SDKinit;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView txtJson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtJson = (TextView) findViewById(R.id.output);
        new RequestTask().execute("");

    }

    private class RequestTask extends AsyncTask<String, String, String> {

        protected String doInBackground(String... params) {
            Map<String, String> options  = new HashMap<String, String>();
            options.put("title", "Problem with email Android againg2");
            options.put("description", "Problem with email Android");
            options.put("sla_date", "17.07.2020 00:00");
            options.put("priority_id", "1");
            options.put("user_email", "example@example.com");
            options.put("create_from_user", "1");

            SDKinit hdesdk = new SDKinit("example@example.com", "your-api-key", "https://example.helpdeskeddy.com");
            String response = hdesdk.TicketCreate(options);
            return response;
        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);
            txtJson.setText(response);
        }

    }
}