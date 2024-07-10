package com.pesona.group.dto.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
public class CommonApiException extends RuntimeException {
    @Getter
    private final HttpStatus status;
    private final String message;
    private final Object errors;

    public CommonApiException(String message, HttpStatus status) {
        super(message);
        this.status = status;
        this.message = message;
        this.errors = null;
    }

    public CommonApiException(String message, HttpStatus status, Object errors) {
        super(message);
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
