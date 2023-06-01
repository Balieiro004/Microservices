package com.balieiro.rest.webservices.restfulwebservices.controller;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    private MessageSource messageSource;

    public HelloController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello-world")
    public String heloWorld(){
        return "Hello Wold";
    }

    @GetMapping(path = "/hello-world-bean")
    public HellotWorldBean heloWorldbean(){
        return new HellotWorldBean("Hello Wold");
    }

    @GetMapping(path = "/hello-world/-variablepath/{name}")
    public HellotWorldBean heloWorldPathVariable(@PathVariable String name){
        return new HellotWorldBean("Hello Wold " + name);
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String heloWorldInternationalized(){

        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
        //return "Hello Wold v2";
    }
}
