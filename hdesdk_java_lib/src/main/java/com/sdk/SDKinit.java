package com.sdk;


import com.sdk.comment.Comment;
import com.sdk.departments.Departments;
import com.sdk.knowledgebase.KnowledgeBase;
import com.sdk.request.RequestHttp;
import com.sdk.tickets.Ticket;
import com.sdk.user.User;

import java.util.Map;

/**
 * Class SDKInit
 */
public class SDKinit {


    private Map<String, String> headers;
    public String answer;
    public RequestHttp request;


    /**
     * Generate a new Request object
     *
     * @param user_email email address for access
     * @param apikey API key of your HelpDeskEddy profile
     * @param hde_url URL of your HelpDeskEddy system
     */
    public SDKinit(String user_email, String apikey, String hde_url) {

        this.request = new RequestHttp(user_email, apikey, hde_url);
    }


    /**
     * Create a new Ticket
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketCreate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketCreate(options);
        return  this.answer;
    }

    /**
     * Update Ticket data by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketUpdate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketUpdate(options);
        return  this.answer;
    }

    /**
     * Get Ticket data by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketGet(options);
        return  this.answer;
    }

    /**
     * Get Tickets list
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketsGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketsGet(options);
        return  this.answer;
    }

    /**
     * Delete Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketDelete(options);
        return  this.answer;
    }

    /**
     * Get Ticket Answers history by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswersGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswersGet(options);
        return  this.answer;
    }

    /**
     * Add new Answer to Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerSet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerSet(options);
        return  this.answer;
    }

    /**
     * Update Ticket Answer by ticket_id and answer id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerUpdate(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerUpdate(options);
        return  this.answer;
    }

    /**
     * Delete Ticket Answer by ticket_id and answer id
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketAnswerDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketAnswerDelete(options);
        return  this.answer;
    }

    /**
     * Get Ticket Statuses List
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketStatusesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketStatusesListGet(options);
        return  this.answer;
    }

    /**
     * Get Ticket Priorities List
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketPrioritiesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketPrioritiesListGet(options);
        return  this.answer;
    }

    /**
     * Get Ticket Types List
     *
     * @param options API request options
     * @return API request answer
     */
    public String TicketTypesListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).TicketTypesListGet(options);
        return  this.answer;
    }

    /**
     * Get Tickets Custom Fields List
     *
     * @param options API request options
     * @return API request answer
     */
    public String CustomFieldsListGet(Map<String, String> options){
        this.answer = new Ticket(this.request).CustomFieldsListGet(options);
        return  this.answer;
    }

    /**
     * Get Custom Field
     *
     * @param options API request options
     * @return API request answer
     */
    public String CustomFieldGet(Map<String, String> options){
        this.answer = new Ticket(this.request).CustomFieldGet(options);
        return  this.answer;
    }

    /**
     * Get Custom Field Options
     *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsGet(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsGet(options);
        return  this.answer;
    }

    /**
     * Set Custom Field Options
     *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsSet(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsSet(options);
        return  this.answer;
    }

    /**
     * Delete Custom Field Option by custom_field_id and option_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String OptionsDelete(Map<String, String> options){
        this.answer = new Ticket(this.request).OptionsDelete(options);
        return  this.answer;
    }
    //------------------------------- /Tickets Part ---------------------------------

    //------------------------------- Comments Part ---------------------------------

    /**
     * Get Comments list by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentsGet(Map<String, String> options){
        this.answer = new Comment(this.request).CommentsGet(options);
        return  this.answer;
    }

    /**
     * Add new Comment to Ticket by ticket_id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentCreate(Map<String, String> options){
        this.answer = new Comment(this.request).CommentCreate(options);
        return  this.answer;
    }

    /**
     * Update Comment data by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentUpdate(Map<String, String> options){
        this.answer = new Comment(this.request).CommentUpdate(options);
        return  this.answer;
    }

    /**
     * Delete Comment by ticket_id and comment id
     *
     * @param options API request options
     * @return API request answer
     */
    public String CommentDelete(Map<String, String> options){
        this.answer = new Comment(this.request).CommentDelete(options);
        return  this.answer;
    }
    //------------------------------- /Comments Part ---------------------------------

    //------------------------------- Users Part ---------------------------------

    /**
     * Get Users list
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserListGet(Map<String, String> options){
        this.answer = new User(this.request).UserListGet(options);
        return  this.answer;
    }

    /**
     * Get User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserGet(Map<String, String> options){
        this.answer = new User(this.request).UserGet(options);
        return  this.answer;
    }

    /**
     * Add new User
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserCreate(Map<String, String> options){
        this.answer = new User(this.request).UserCreate(options);
        return  this.answer;
    }

    /**
     * Update User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserUpdate(Map<String, String> options){
        this.answer = new User(this.request).UserUpdate(options);
        return  this.answer;
    }

    /**
     * Delete User data by id
     *
     * @param options API request options
     * @return API request answer
     */
    public String UserDelete(Map<String, String> options){
        this.answer = new User(this.request).UserDelete(options);
        return  this.answer;
    }
    //------------------------------- /Users Part ---------------------------------

    //------------------------------- Departments Part ----------------------------

    /**
     * Get Departments list
     *
     * @param options API request options
     * @return API request answer
     */
    public String DepartmentListGet(Map<String, String> options){
        this.answer = new Departments(this.request).DepartmentListGet(options);
        return  this.answer;
    }
    //------------------------------- /Departments Part ---------------------------

    //------------------------------- Knowledge Base Part ----------------------------

    /**
     * Get Knowledge Base Categories list
     *
     * @param options API request options
     * @return API request answer
     */
    public String CategoriesListGet(Map<String, String> options){
        this.answer = new KnowledgeBase(this.request).CategoriesListGet(options);
        return  this.answer;
    }

    /**
     * Get Knowledge Base Articles list
     *
     * @param options API request options
     * @return API request answer
     */
    public String ArticlesListGet(Map<String, String> options){
        this.answer = new KnowledgeBase(this.request).ArticlesListGet(options);
        return  this.answer;
    }
    //------------------------------- /Knowledge Base Part  ---------------------------

}
