package com.sdk.auth;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Auth {

    public String AuthKey(String user_email, String api_key){
        String access_token;

        String originalInput = user_email+":"+api_key;
        byte[] data = originalInput.getBytes(StandardCharsets.UTF_8);
        access_token = Base64.encodeToString(data, Base64.DEFAULT);

        return access_token;
    }
}
