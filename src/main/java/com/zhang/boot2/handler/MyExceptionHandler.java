package com.zhang.boot2.handler;

import com.zhang.boot2.entity.ResponseVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;
import java.util.stream.Collectors;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseVO constraintViolationExceptionHandler(ConstraintViolationException exception){
        String message = exception.getConstraintViolations().stream().findFirst().map(ConstraintViolation::getMessage).get();

        return ResponseVO.errot(message);
    }
}
