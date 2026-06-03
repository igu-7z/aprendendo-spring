package com.javanauta.aprendendospring.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String menesagem, Throwable throwable){
        super(menesagem, throwable);
    }
}
