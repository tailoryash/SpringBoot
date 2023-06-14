package com.springmvc.searchbar.searchbar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

@ControllerAdvice
public class MyExceptionHandler {
    //handling error
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({NullPointerException.class, IOException.class})
    public String exceptionHandler(){
        return "error_page";
    }
}
