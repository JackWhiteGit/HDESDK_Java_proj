package com.sdk.auth;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

/**
 * Access token generation
 *
 */
public class Auth {
    /**
     *Access token generation
     *
     * @param user_email  email address for access
     * @param api_key API key of your HelpDeskEddy profile
     * @return String, Base64 access token
     */
    public String AuthKey(String user_email, String api_key){
        String access_token;

        String originalInput = user_email+":"+api_key;
        byte[] data = originalInput.getBytes(StandardCharsets.UTF_8);
        access_token = Base64.encodeToString(data, Base64.DEFAULT);

        return access_token;
    }
}
