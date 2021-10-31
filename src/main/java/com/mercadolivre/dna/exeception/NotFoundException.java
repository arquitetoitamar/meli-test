package com.mercadolivre.dna.exeception;

public class NotFoundException extends ApiException {
    public NotFoundException(int code, String msg) {
        super(code, msg);
    }
}
