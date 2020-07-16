package com.sdk.knowledgebase;

import com.sdk.request.RequestHttp;

import java.util.Map;

public class KnowledgeBase {

    public String answer;
    public RequestHttp requesthttp;


    public KnowledgeBase(RequestHttp request) {
        this.requesthttp = request;
    }

    public String CategoriesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CategoriesListGet", options);
        return  this.answer;
    }

    public String ArticlesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("ArticlesListGet", options);
        return  this.answer;
    }
}
