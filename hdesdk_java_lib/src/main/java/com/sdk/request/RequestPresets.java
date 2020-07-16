package com.sdk.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RequestPresets {

    public Map<String, String> RequestOptions(String request_type, Map<String, String> options_arr) {
        String id = "";
        String ticket_id = "";
        String custom_field_id = "";
        String option_id = "";
        if(options_arr.get("id")!=null) id = options_arr.get("id");
        if(options_arr.get("ticket_id")!=null) id = options_arr.get("ticket_id");
        if(options_arr.get("custom_field_id")!=null) id = options_arr.get("custom_field_id");
        if(options_arr.get("option_id")!=null) id = options_arr.get("option_id");
        Map<String, Map<String, String>> options = new HashMap<String, Map<String, String>>();
        Map<String, String> temp = new HashMap<String, String>();

        switch (request_type) {

            case "DepartmentListGet":
                temp.put("method", "GET");
                temp.put("url", "/departments/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("DepartmentListGet", temp);
                break;

            case "TicketCreate":
                temp.put("method", "POST");
                temp.put("url", "/tickets/");
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "");
                options.put("TicketCreate", temp);
                break;

            case "TicketUpdate":
                temp.put("method", "PUT");
                temp.put("url", "/tickets/" + id);
                temp.put("content_type", "application/json");
                temp.put("url_part", "{{id}}");
                options.put("TicketUpdate", temp);
                break;

            case "TicketGet":
                temp.put("method", "GET");
                temp.put("url", "/tickets/" + id);
                temp.put("content_type", "");
                temp.put("url_part", "{{id}}");
                options.put("TicketGet", temp);
                break;

            case "TicketsGet":
                temp.put("method", "GET");
                temp.put("url", "/tickets/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("TicketsGet", temp);
                break;

            case "TicketDelete":
                temp.put("method", "DELETE");
                temp.put("url", "/tickets/" + id);
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{id}}");
                options.put("TicketDelete", temp);
                break;

            case "TicketAnswersGet":
                temp.put("method", "GET");
                temp.put("url", "/tickets/" + ticket_id + "/posts/");
                temp.put("content_type", "");
                temp.put("url_part", "{{ticket_id}}");
                options.put("TicketAnswersGet", temp);
                break;

            case "TicketAnswerSet":
                temp.put("method", "POST");
                temp.put("url", "/tickets/" + ticket_id + "/posts/");
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{ticket_id}}");
                options.put("TicketAnswerSet", temp);
                break;

            case "TicketAnswerUpdate":
                temp.put("method", "PUT");
                temp.put("url", "/tickets/" + ticket_id + "/posts/" + id);
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{ticket_id}}{{id}}");
                options.put("TicketAnswerUpdate", temp);
                break;

            case "TicketAnswerDelete":
                temp.put("method", "DELETE");
                temp.put("url", "/tickets/" + ticket_id + "/posts/" + id);
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{ticket_id}}{{id}}");
                options.put("TicketAnswerDelete", temp);
                break;

            case "CommentsGet":
                temp.put("method", "GET");
                temp.put("url", "/tickets/" + ticket_id + "/comments/");
                temp.put("content_type", "");
                temp.put("url_part", "{{ticket_id}}");
                options.put("CommentsGet", temp);
                break;

            case "CommentCreate":
                temp.put("method", "POST");
                temp.put("url", "/tickets/" + ticket_id + "/comments/");
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{ticket_id}}{{id}}");
                options.put("CommentCreate", temp);
                break;

            case "CommentUpdate":
                temp.put("method", "PUT");
                temp.put("url", "/tickets/" + ticket_id + "/comments/" + id);
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "{{ticket_id}}{{id}}");
                options.put("CommentUpdate", temp);
                break;

            case "CommentDelete":
                temp.put("method", "DELETE");
                temp.put("url", "/tickets/" + ticket_id + "/comments/" + id);
                temp.put("content_type", "");
                temp.put("url_part", "{{ticket_id}}{{id}}");
                options.put("CommentDelete", temp);
                break;

            case "UserListGet":
                temp.put("method", "GET");
                temp.put("url", "/users/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("UserListGet", temp);
                break;

            case "UserGet":
                temp.put("method", "GET");
                temp.put("url", "/users/" + id);
                temp.put("content_type", "");
                temp.put("url_part", "{{id}}");
                options.put("UserGet", temp);
                break;

            case "UserCreate":
                temp.put("method", "POST");
                temp.put("url", "/users/");
                temp.put("content_type", "application/x-www-form-urlencoded");
                temp.put("url_part", "");
                options.put("UserCreate", temp);
                break;

            case "UserUpdate":
                temp.put("method", "PUT");
                temp.put("url", "/users/" + id);
                temp.put("content_type", "application/json");
                temp.put("url_part", "{{id}}");
                options.put("UserUpdate", temp);
                break;

            case "UserDelete":
                temp.put("method", "DELETE");
                temp.put("url", "/users/"  + id);
                temp.put("content_type", "");
                temp.put("url_part", "{{id}}");
                options.put("UserDelete", temp);
                break;

            case "CategoriesListGet":
                temp.put("method", "GET");
                temp.put("url", "/knowledge_base/categories/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("CategoriesListGet", temp);
                break;

            case "ArticlesListGet":
                temp.put("method", "GET");
                temp.put("url", "/knowledge_base/articles/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("ArticlesListGet", temp);
                break;

            case "TicketStatusesListGet":
                temp.put("method", "GET");
                temp.put("url", "/statuses/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("TicketStatusesListGet", temp);
                break;

            case "TicketPrioritiesListGet":
                temp.put("method", "GET");
                temp.put("url", "/priorities/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("TicketPrioritiesListGet", temp);
                break;

            case "TicketTypesListGet":
                temp.put("method", "GET");
                temp.put("url", "/types/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("TicketTypesListGet", temp);
                break;

            case "CustomFieldsListGet":
                temp.put("method", "GET");
                temp.put("url", "/custom_fields/");
                temp.put("content_type", "");
                temp.put("url_part", "");
                options.put("CustomFieldsListGet", temp);
                break;

            case "CustomFieldGet":
                temp.put("method", "GET");
                temp.put("url", "/custom_fields/"+custom_field_id);
                temp.put("content_type", "");
                temp.put("url_part", "{{custom_field_id}}");
                options.put("CustomFieldGet", temp);
                break;

            case "OptionsGet":
                temp.put("method", "GET");
                temp.put("url", "/custom_fields/"+custom_field_id+"/options/");
                temp.put("content_type", "");
                temp.put("url_part", "{{custom_field_id}}");
                options.put("OptionsGet", temp);
                break;

            case "OptionsSet":
                temp.put("method", "POST");
                temp.put("url", "/custom_fields/"+custom_field_id+"/options/");
                temp.put("content_type", "application/json");
                temp.put("url_part", "{{custom_field_id}}");
                options.put("OptionsSet", temp);
                break;

            case "OptionsDelete":
                temp.put("method", "DELETE");
                temp.put("url", "/custom_fields/"+custom_field_id+"/options/"+option_id);
                temp.put("content_type", "");
                temp.put("url_part", "{{custom_field_id}}{{option_id}}");
                options.put("OptionsDelete", temp);
                break;
        }
        return options.get(request_type);
    }

    public String RequestData (String request_type, Map<String, String> options_arr){

        StringBuilder requerstData = new StringBuilder();
        Map<String, String> requestoptions =  RequestOptions(request_type, options_arr);

        switch (Objects.requireNonNull(requestoptions.get("method"))) {
            case "GET":
                requerstData.append("?");
                for (Map.Entry<String,String> entry : options_arr.entrySet()) {
                    if (!Objects.requireNonNull(requestoptions.get("url_part")).contains("{{" + entry.getKey() + "}}")) {
                        requerstData.append(entry.getKey()).append("=").append(encodeValue(entry.getValue())).append("&");
                    }
                }
                requerstData.deleteCharAt( requerstData.length() - 1 );
                break;

            case "POST":
            case "PUT":

                if(Objects.equals(requestoptions.get("content_type"), "application/x-www-form-urlencoded")){
                    for (Map.Entry<String,String> entry : options_arr.entrySet()) {
                        if (!Objects.requireNonNull(requestoptions.get("url_part")).contains("{{" + entry.getKey() + "}}")) {
                            requerstData.append(entry.getKey()).append("=").append(encodeValue(entry.getValue())).append("&");
                        }
                    }
                    requerstData.deleteCharAt( requerstData.length() - 1 );
                }

                break;

        }
        return requerstData.toString();
    }

    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }

    public static String removeLastCharacter(String str) {
        String result = null;
        if ((str != null) && (str.length() > 0)) {
            result = str.substring(0, str.length() - 1);
        }
        return result;
    }

}
