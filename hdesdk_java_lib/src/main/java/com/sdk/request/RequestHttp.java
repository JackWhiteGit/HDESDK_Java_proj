package com.sdk.request;

import android.util.Log;

import com.sdk.auth.Auth;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;

/**
 * Request construct class
 */
public class RequestHttp {

    private String user_email;
    private String apikey;
    private String hde_url;
    private String auth_token;

    /**
     *
     * @param user_email email address for access
     * @param apikey API key of your HelpDeskEddy profile
     * @param hde_url URL of your HelpDeskEddy system
     */
    public RequestHttp(String user_email, String apikey, String hde_url) {
        this.user_email = user_email;
        this.apikey = apikey;
        this.hde_url = hde_url;
        this.auth_token = new Auth().AuthKey(user_email, apikey);
    }

    /**
     * Request generetion method
     * @param request_type type of API request
     * @param options_arr request options
     * @return JSON String, HelpDeskEddy API answer
     */
    public String Request (String request_type, Map<String, String> options_arr){
        String line = "";
        byte[] dataPost = new byte[0];
        String dataGet = "";
        boolean output = false;
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        int    postDataLength = 0;
        StringBuilder buffer = new StringBuilder();
        Map<String, String> options = new RequestPresets().RequestOptions(request_type, options_arr);
        if (Objects.equals(options.get("method"), "GET")){
            dataGet = new RequestPresets().RequestData(request_type, options_arr);

        }
        else if(Objects.equals(options.get("method"), "POST") || Objects.equals(options.get("method"), "PUT")){
            output = true;
            dataPost      = new RequestPresets().RequestData(request_type, options_arr).getBytes( StandardCharsets.UTF_8 );
            postDataLength = dataPost.length;
        }

        try {

            URL url = new URL (this.hde_url+"/api/v2"+ options.get("url") + dataGet);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(options.get("method"));
            connection .addRequestProperty("Authorization", "Basic " + this.auth_token);
            connection .addRequestProperty("Content-Type", options.get("content_type"));
            connection.setDoOutput(output);
            if(postDataLength>0){
                connection.setRequestProperty( "Content-Length", Integer.toString( postDataLength ));
                try( DataOutputStream wr = new DataOutputStream( connection.getOutputStream())) {
                    wr.write( dataPost );
                }
            }
            connection.connect();
            InputStream stream = connection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));

            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
                Log.d("Response: ", "> " + line);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
