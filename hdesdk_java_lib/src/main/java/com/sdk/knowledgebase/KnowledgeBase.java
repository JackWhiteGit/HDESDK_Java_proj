package com.sdk.knowledgebase;

import com.sdk.request.RequestHttp;

import java.util.Map;

/**
 * Knowledge Base request's class
 */
public class KnowledgeBase {

    public String answer;
    public RequestHttp requesthttp;

    /**
     * Request init
     * @param request new request object
     */
    public KnowledgeBase(RequestHttp request) {
        this.requesthttp = request;
    }

    /**
     * Get Knowledge Base Categories list
     *
     * @param options API request options
     * @return API request answer
     */
    public String CategoriesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CategoriesListGet", options);
        return  this.answer;
    }

    /**
     * Get Knowledge Base Articles list
     *
     * @param options API request options
     * @return API request answer
     */
    public String ArticlesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("ArticlesListGet", options);
        return  this.answer;
    }
}
