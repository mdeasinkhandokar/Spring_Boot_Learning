package com.example.RestApi_User_Service.exception;


import com.example.RestApi_User_Service.models.APIError;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<APIError> handleRuntimeException(ResourceNotFoundException ex, HttpServletRequest request){

        HttpStatus status= HttpStatus.NOT_FOUND;
        APIError apiError= new APIError(
                LocalDate.now(),
                status.value(),
                status.name(),
                ex.getMessage(),
               request.getRequestURI());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);

    }




}
