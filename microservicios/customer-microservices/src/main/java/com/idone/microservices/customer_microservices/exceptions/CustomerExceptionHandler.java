package com.idone.microservices.customer_microservices.exceptions;

import java.util.HashMap;

import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.idone.microservices.common.exceptions.ErrorResponse;
import com.idone.microservices.common.exceptions.GlobalExceptionHandler;

@RestControllerAdvice(basePackages = "com.idone.microservices.customer_microservices")
@Primary
public class CustomerExceptionHandler extends GlobalExceptionHandler{

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handle (CustomerNotFoundException exception)
    {
      
        var errors = new HashMap<String, String>();
        var fieldName = "customer";
        errors.put(fieldName, exception.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errors)); 

    }
}
