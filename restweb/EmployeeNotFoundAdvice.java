package com.example.restweb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {

    @ResponseBody // signaling to render exception into response body
    @ExceptionHandler(EmployeeNotFoundException.class) // configs the advice to only respond if the exception provided
                                                       // is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNOtFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
