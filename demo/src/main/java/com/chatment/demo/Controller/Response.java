package com.chatment.demo.Controller;

public class Response {
    private ApiCallResponseStatus status;
    private String message;


    public Response(ApiCallResponseStatus status) {
        this.status = status;
        this.message = "";
    }

    public Response(ApiCallResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
