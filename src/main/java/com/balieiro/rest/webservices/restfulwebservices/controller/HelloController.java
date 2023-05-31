package com.balieiro.rest.webservices.restfulwebservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello-world")
    public String heloWorld(){
        return "Hello Wold vamos ver";
    }

    @GetMapping(path = "/hello-world-bean")
    public HellotWorldBean heloWorldbean(){
        return new HellotWorldBean("Hello Wold");
    }

    @GetMapping(path = "/hello-world/-variablepath/{name}")
    public HellotWorldBean heloWorldPathVariable(@PathVariable String name){
        return new HellotWorldBean("Hello Wold " + name);
    }
}
