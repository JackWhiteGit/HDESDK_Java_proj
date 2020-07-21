package com.sdk.tickets;

import com.sdk.request.RequestHttp;

import java.util.Map;

/**
 * Tickets request's class
 */

public class Ticket {

    public String answer;
    public RequestHttp requesthttp;

    /**
     * Request init
     * @param request new request object
     */
    public Ticket(RequestHttp request) {
       this.requesthttp = request;
    }


    /**
     * Create a new Ticket
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketCreate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketCreate", options);
        return  this.answer;
    }

     /**
      * Update Ticket data by ticket_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketUpdate", options);
        return  this.answer;
    }

     /**
      * Get Ticket data by ticket_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketGet", options);
        return  this.answer;
    }

     /**
      * Get Tickets list
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketsGet", options);
        return  this.answer;
    }

     /**
      * Delete Ticket by ticket_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketDelete", options);
        return  this.answer;
    }

     /**
      * Get Ticket Answers history by ticket_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswersGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswersGet", options);
        return  this.answer;
    }

     /**
      * Add new Answer to Ticket by ticket_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerSet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerSet", options);
        return  this.answer;
    }

     /**
      * Update Ticket Answer by ticket_id and answer id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerUpdate(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerUpdate", options);
        return  this.answer;
    }

     /**
      * Delete Ticket Answer by ticket_id and answer id
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketAnswerDelete", options);
        return  this.answer;
    }

     /**
      * Get Ticket Statuses List
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketStatusesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketStatusesListGet", options);
        return  this.answer;
    }

     /**
      * Get Ticket Priorities List
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketPrioritiesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketPrioritiesListGet", options);
        return  this.answer;
    }

     /**
      * Get Ticket Types List
      *
     * @param options API request options
     * @return API request answer
     */
    public String TicketTypesListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("TicketTypesListGet", options);
        return  this.answer;
    }

     /**
      * Get Tickets Custom Fields List
      *
     * @param options API request options
     * @return API request answer
     */
    public String CustomFieldsListGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CustomFieldsListGet", options);
        return  this.answer;
    }

     /**
      * Get Custom Field
      *
     * @param options API request options
     * @return API request answer
     */
    public String CustomFieldGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("CustomFieldGet", options);
        return  this.answer;
    }

     /**
      * Get Custom Field Options
      *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsGet(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsGet", options);
        return  this.answer;
    }

     /**
      * Set Custom Field Options
      *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsSet(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsSet", options);
        return  this.answer;
    }

     /**
      * Delete Custom Field Option by custom_field_id and option_id
      *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsDelete(Map<String, String> options){
        this.answer = this.requesthttp.Request("OptionsDelete", options);
        return  this.answer;
    }
}
