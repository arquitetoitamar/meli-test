package com.mercadolivre.dna.dto;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApiResponseMessageTest {

    @Test
    public void testValues() {
        assertEquals("Unknown Error", ApiResponseMessage.UNKNOW_ERRO.getMessage());
        assertEquals("Invalid Request", ApiResponseMessage.BAD_REQUEST.getMessage());
    }

    @Test
    public void testValueOf() {
        ApiResponseMessage bad_request = ApiResponseMessage.valueOf("BAD_REQUEST");

        assertEquals(ApiResponseMessage.BAD_REQUEST, bad_request);

        ApiResponseMessage unknow_erro = ApiResponseMessage.valueOf("UNKNOW_ERRO");

        assertEquals(ApiResponseMessage.UNKNOW_ERRO, unknow_erro);
    }
}