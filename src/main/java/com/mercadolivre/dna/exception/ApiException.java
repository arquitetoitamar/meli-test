package com.mercadolivre.dna.exception;

public class ApiException extends Exception {
    protected int code;
    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
