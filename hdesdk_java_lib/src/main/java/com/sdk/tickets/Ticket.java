package com.sdk.tickets;

import com.sdk.request.RequestHttp;

import java.util.Map;

public class Ticket {
    public String answer;
    public RequestHttp requesthttp;


    public Ticket(RequestHttp request) {
       this.requesthttp = request;
    }

    public String TicketCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketCreate", options);
        return  this.answer;
    }

    public String TicketUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketUpdate", options);
        return  this.answer;
    }

    public String TicketGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketGet", options);
        return  this.answer;
    }

    public String TicketsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketsGet", options);
        return  this.answer;
    }

    public String TicketDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketDelete", options);
        return  this.answer;
    }

    public String TicketAnswersGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswersGet", options);
        return  this.answer;
    }

    public String TicketAnswerSet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerSet", options);
        return  this.answer;
    }

    public String TicketAnswerUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerUpdate", options);
        return  this.answer;
    }

    public String TicketAnswerDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerDelete", options);
        return  this.answer;
    }

    public String TicketStatusesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketStatusesListGet", options);
        return  this.answer;
    }

    public String TicketPrioritiesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketPrioritiesListGet", options);
        return  this.answer;
    }

    public String TicketTypesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketTypesListGet", options);
        return  this.answer;
    }

    public String CustomFieldsListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CustomFieldsListGet", options);
        return  this.answer;
    }

    public String CustomFieldGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CustomFieldGet", options);
        return  this.answer;
    }

    public String OptionsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsGet", options);
        return  this.answer;
    }

    public String OptionsSet(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsSet", options);
        return  this.answer;
    }

    public String OptionsDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsDelete", options);
        return  this.answer;
    }
}
