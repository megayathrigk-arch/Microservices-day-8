package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            UserServiceUnavailableException.class)
    public ResponseEntity<String> handleException(
            UserServiceUnavailableException ex) {

        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(ex.getMessage());
    }
        @ExceptionHandler(RuntimeException.class)
        public ResponseEntity<String>handleRuntimeException(RuntimeException ex){
        	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        	
        
    }
}