package com.mercadolivre.dna.exeception;

public class ApiException extends Exception {
    protected int code;
    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
