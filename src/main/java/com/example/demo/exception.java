package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class exception extends RuntimeException{
    public exception(String message, String id, long l){
        super(message);
    }
}