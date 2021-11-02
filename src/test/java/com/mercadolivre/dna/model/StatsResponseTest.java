package com.mercadolivre.dna.model;


import com.mercadolivre.dna.util.DtoTest;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsResponseTest extends DtoTest<StatsResponse> {

    @Override
    public  StatsResponse getInstance() {
        return new StatsResponse();
    }
    @Test
    public void testStatsResponse(){
        StatsResponse build = StatsResponse.builder()
                .ratio(1.0)
                .countSimianDna(0)
                .countHumanDna(0)
                .build();

        StatsResponse aaa = new StatsResponse(0,0,1.0);

        assertEquals(build.getRatio(), aaa.getRatio());

        assertNotNull(aaa.toString());

        assertTrue(build.canEqual(aaa));

        assertEquals(aaa.hashCode(), build.hashCode());

        assertFalse(aaa.equals("1"));
    }
}