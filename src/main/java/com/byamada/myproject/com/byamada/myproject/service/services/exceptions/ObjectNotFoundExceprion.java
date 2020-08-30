package com.byamada.myproject.com.byamada.myproject.service.services.exceptions;

public class ObjectNotFoundExceprion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundExceprion(String msg){
        super(msg);
    }

    public ObjectNotFoundExceprion(String msg, Throwable cause){
        super(msg, cause);
    }
}
