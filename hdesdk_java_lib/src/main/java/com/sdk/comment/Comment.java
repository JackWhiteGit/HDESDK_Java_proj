package com.sdk.comment;

import com.sdk.request.RequestHttp;

import java.util.Map;

/**
 * Comments request's class
 */

public class Comment {

    public String answer;
    public RequestHttp requesthttp;

    /**
     * Request init
     * @param request new request object
     */
    public Comment(RequestHttp request) {
        this.requesthttp = request;
    }

    /**
     * Get Comments list by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentsGet", options);
        return  this.answer;
    }

    /**
     * Add new Comment to Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentCreate", options);
        return  this.answer;
    }

    /**
     * Update Comment data by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentUpdate", options);
        return  this.answer;
    }

    /**
     * Delete Comment by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("CommentDelete", options);
        return  this.answer;
    }
}
