package com.sdk.departments;

import com.sdk.request.RequestHttp;

import java.util.Map;

public class Departments {

    public String answer;
    public RequestHttp requesthttp;


    public Departments(RequestHttp request) {
        this.requesthttp = request;
    }

    public String DepartmentListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("DepartmentListGet", options);
        return  this.answer;
    }
}
