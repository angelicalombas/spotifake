package com.spotifake.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@ControllerAdvice(basePackages = "com.spotifake.adapter.rest")
public class PlaylistMusicaControllerAdvice {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageExceptionHandler> argumentsNotValid(MethodArgumentNotValidException notValid){

        BindingResult result = notValid.getBindingResult();
        List<FieldError> fieldErrorList = result.getFieldErrors();

        StringBuilder sb = new StringBuilder("O(s) seguinte(s) campo(s) do payload body devem ser informado(s): ");
        for(FieldError fieldError: fieldErrorList){
            sb.append(" * ");
            sb.append(fieldError.getField());
            sb.append(" * ");
        }

        MessageExceptionHandler error = new MessageExceptionHandler(
                new Date(), HttpStatus.BAD_REQUEST.value(), sb.toString());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }
}
