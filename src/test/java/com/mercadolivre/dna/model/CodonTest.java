package com.mercadolivre.dna.model;

import com.mercadolivre.dna.util.DtoTest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CodonTest extends DtoTest<Codon> {

    @Override
    public  Codon getInstance() {
        return new Codon();
    }
    @Test
    public void testCodon(){
        Codon build = Codon.builder()
                .basesNitrogenizes("AAA")
                .build();

        Codon aaa = new Codon("AAA");
        assertEquals(build.getBasesNitrogenizes(), aaa.getBasesNitrogenizes());
        assertNotNull(aaa.toString());
    }
}