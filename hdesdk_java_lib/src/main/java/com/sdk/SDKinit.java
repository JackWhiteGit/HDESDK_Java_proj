package com.sdk;


import com.sdk.comment.Comment;
import com.sdk.departments.Departments;
import com.sdk.knowledgebase.KnowledgeBase;
import com.sdk.request.RequestHttp;
import com.sdk.tickets.Ticket;
import com.sdk.user.User;

import java.util.Map;

public class SDKinit {


    private Map<String, String> headers;
    public String answer;
    public RequestHttp request;


    public SDKinit(String user_email, String apikey, String hde_url) {

        this.request = new RequestHttp(user_email, apikey, hde_url);
    }

    public String TicketCreate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketCreate(options);
        return  this.answer;
    }

    public String TicketUpdate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketUpdate(options);
        return  this.answer;
    }


    public String TicketGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketGet(options);
        return  this.answer;
    }

    public String TicketsGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketsGet(options);
        return  this.answer;
    }

    public String TicketDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketDelete(options);
        return  this.answer;
    }

    public String TicketAnswersGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswersGet(options);
        return  this.answer;
    }

    public String TicketAnswerSet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerSet(options);
        return  this.answer;
    }

    public String TicketAnswerUpdate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerUpdate(options);
        return  this.answer;
    }

    public String TicketAnswerDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerDelete(options);
        return  this.answer;
    }

    public String TicketStatusesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketStatusesListGet(options);
        return  this.answer;
    }

    public String TicketPrioritiesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketPrioritiesListGet(options);
        return  this.answer;
    }

    public String TicketTypesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketTypesListGet(options);
        return  this.answer;
    }

    public String CustomFieldsListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).CustomFieldsListGet(options);
        return  this.answer;
    }

    public String CustomFieldGet(Map<String, String> options){
        this.answer = new Ticket(this.request).CustomFieldGet(options);
        return  this.answer;
    }

    public String OptionsGet(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsGet(options);
        return  this.answer;
    }

    public String OptionsSet(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsSet(options);
        return  this.answer;
    }

    public String OptionsDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsDelete(options);
        return  this.answer;
    }
    //------------------------------- /Tickets Part ---------------------------------

    //------------------------------- Comments Part ---------------------------------

    public String CommentsGet(Map<String, String> options){
        this.answer = new Comment(this.request).CommentsGet(options);
        return  this.answer;
    }

    public String CommentCreate(Map<String, String> options){
        this.answer = new Comment(this.request).CommentCreate(options);
        return  this.answer;
    }

    public String CommentUpdate(Map<String, String> options){
        this.answer = new Comment(this.request).CommentUpdate(options);
        return  this.answer;
    }

    public String CommentDelete(Map<String, String> options){
        this.answer = new Comment(this.request).CommentDelete(options);
        return  this.answer;
    }
    //------------------------------- /Comments Part ---------------------------------

    //------------------------------- Users Part ---------------------------------

    public String UserListGet(Map<String, String> options){
        this.answer = new User(this.request).UserListGet(options);
        return  this.answer;
    }

    public String UserGet(Map<String, String> options){
        this.answer = new User(this.request).UserGet(options);
        return  this.answer;
    }

    public String UserCreate(Map<String, String> options){
        this.answer = new User(this.request).UserCreate(options);
        return  this.answer;
    }

    public String UserUpdate(Map<String, String> options){
        this.answer = new User(this.request).UserUpdate(options);
        return  this.answer;
    }

    public String UserDelete(Map<String, String> options){
        this.answer = new User(this.request).UserDelete(options);
        return  this.answer;
    }
    //------------------------------- /Users Part ---------------------------------

    //------------------------------- Departments Part ----------------------------

    public String DepartmentListGet(Map<String, String> options){
        this.answer = new Departments(this.request).DepartmentListGet(options);
        return  this.answer;
    }
    //------------------------------- /Departments Part ---------------------------

    //------------------------------- Knowledge Base Part ----------------------------

    public String CategoriesListGet(Map<String, String> options){
        this.answer = new KnowledgeBase(this.request).CategoriesListGet(options);
        return  this.answer;
    }

    public String ArticlesListGet(Map<String, String> options){
        this.answer = new KnowledgeBase(this.request).ArticlesListGet(options);
        return  this.answer;
    }
    //------------------------------- /Knowledge Base Part  ---------------------------

}
