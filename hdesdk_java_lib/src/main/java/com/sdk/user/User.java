package com.sdk.user;
import com.sdk.request.RequestHttp;

import java.util.Map;

public class User {

    public String answer;
    public RequestHttp requesthttp;


    public User(RequestHttp request) {
        this.requesthttp = request;
    }

    public String UserListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserListGet", options);
        return  this.answer;
    }

    public String UserGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserGet", options);
        return  this.answer;
    }

    public String UserCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserCreate", options);
        return  this.answer;
    }

    public String UserUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserUpdate", options);
        return  this.answer;
    }

    public String UserDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("UserDelete", options);
        return  this.answer;
    }
}
