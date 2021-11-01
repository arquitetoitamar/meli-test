package com.mercadolivre.dna.exception;

public class NotFoundException extends ApiException {
    public NotFoundException(int code, String msg) {
        super(code, msg);
    }
}
