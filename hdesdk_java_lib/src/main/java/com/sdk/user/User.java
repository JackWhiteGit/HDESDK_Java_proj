package com.sdk.user;
import com.sdk.request.RequestHttp;

import java.util.Map;

/**
 * User request's class
 */
public class User {

    public String answer;
    public RequestHttp requesthttp;


    /**
     * Request init
     * @param request new request object
     */
    public User(RequestHttp request) {
        this.requesthttp = request;
    }

    /**
     * Get Users list
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserListGet", options);
        return  this.answer;
    }

    /**
     * Get User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserGet", options);
        return  this.answer;
    }

    /**
     * Add new User
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserCreate", options);
        return  this.answer;
    }

    /**
     * Update User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserUpdate", options);
        return  this.answer;
    }

    /**
     * Delete User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserDelete", options);
        return  this.answer;
    }
}
