package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler({BuzzException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public GlobalError handleException1(BuzzException e){
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }

    @ResponseBody
    @ExceptionHandler({FizzBuzzException.class})
    @ResponseStatus(value = HttpStatus.INSUFFICIENT_STORAGE)
    public GlobalError handleException2(FizzBuzzException e){
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }

    @ResponseBody
    @ExceptionHandler({FizzException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public GlobalError handleException3(FizzException e){
        return new GlobalError(e.getMessage(),e.getErrorReason());
    }

}
