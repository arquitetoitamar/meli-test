package com.mercadolivre.dna.dto;

import com.mercadolivre.dna.model.StatsResponse;
import com.mercadolivre.dna.util.DtoTest;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
public class StatsResponseDtoTest  extends DtoTest<StatsResponseDto> {

    @Override
    public  StatsResponseDto getInstance() {
        return new StatsResponseDto();
    }
    @Test
    public void testStatsResponseDto(){
        StatsResponseDto statsResponseDto = new StatsResponseDto(StatsResponse.builder()
                .countHumanDna(0)
                .countSimianDna(0)
                .ratio(0.0)
                .build());
        assertNotNull(statsResponseDto);
    }
}