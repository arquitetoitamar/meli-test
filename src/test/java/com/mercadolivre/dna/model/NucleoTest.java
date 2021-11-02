package com.mercadolivre.dna.model;


import com.mercadolivre.dna.enumerator.DnaType;
import com.mercadolivre.dna.util.DtoTest;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NucleoTest extends DtoTest<Nucleo> {

    public static final String DNA_SEQUENCE = "AAA";

    @Override
    public  Nucleo getInstance() {
        return new Nucleo();
    }

    @Test
    public void testNucleo(){
        List<Codon> codons = List.of(Codon.builder()
                .basesNitrogenizes(DNA_SEQUENCE)
                .build());
        Nucleo build = Nucleo.builder()
                .dnaSequence(DNA_SEQUENCE)
                .dnaType(DnaType.SIMIAN)
                .tape(codons)
                .build();

        Nucleo aaa = new Nucleo(DNA_SEQUENCE, DnaType.SIMIAN, codons);

        assertEquals(build.getDnaSequence(), aaa.getDnaSequence());

        assertNotNull(aaa.toString());

        assertTrue(build.canEqual(aaa));

        assertEquals(aaa.hashCode(), build.hashCode());

        assertFalse(aaa.equals("1"));
    }
}