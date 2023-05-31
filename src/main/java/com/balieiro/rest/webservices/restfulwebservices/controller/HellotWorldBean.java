package com.balieiro.rest.webservices.restfulwebservices.controller;

public class HellotWorldBean {

    private String message;

    public HellotWorldBean(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HellotWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
