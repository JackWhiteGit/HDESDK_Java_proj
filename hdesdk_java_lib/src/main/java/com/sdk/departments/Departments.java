package com.sdk.departments;

import com.sdk.request.RequestHttp;

import java.util.Map;

/**
 * Departments request's class
 */

public class Departments {

    public String answer;
    public RequestHttp requesthttp;

    /**
     * Request init
     * @param request new request object
     */
    public Departments(RequestHttp request) {
        this.requesthttp = request;
    }

    /**
     * Get Departments list
     *
     * @param options API request options
     * @return API request answer
     */
    public String DepartmentListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("DepartmentListGet", options);
        return  this.answer;
    }
}
