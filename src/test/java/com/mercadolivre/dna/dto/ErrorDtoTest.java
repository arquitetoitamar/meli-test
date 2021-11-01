package com.mercadolivre.dna.dto;

import com.mercadolivre.dna.util.DtoTest;

public class ErrorDtoTest extends DtoTest<ErrorDto> {
    @Override
    public  ErrorDto getInstance() {
        return new ErrorDto();
    }
}