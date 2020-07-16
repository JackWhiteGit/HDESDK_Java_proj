package com.sdk.comment;

import com.sdk.request.RequestHttp;

import java.util.Map;

public class Comment {

    public String answer;
    public RequestHttp requesthttp;


    public Comment(RequestHttp request) {
        this.requesthttp = request;
    }

    public String CommentsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentsGet", options);
        return  this.answer;
    }

    public String CommentCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentCreate", options);
        return  this.answer;
    }

    public String CommentUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentUpdate", options);
        return  this.answer;
    }

    public String CommentDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentDelete", options);
        return  this.answer;
    }
}
