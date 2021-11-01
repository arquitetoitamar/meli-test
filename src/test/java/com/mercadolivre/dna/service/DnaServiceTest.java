package com.mercadolivre.dna.service;

import com.mercadolivre.dna.service.impl.CalculatorServiceImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DnaServiceTest {

    public static final List<String> SIMIAN_SEQUENCE = List.of("CTGAGA","CTATGC","TATTGT","AGAGGG","CCCCTA","TCACTG");
    public static final List<String> HUMAN_SEQUENCE = List.of("TCGACA","AGAGGG","CTATGC","TATTGT","GCCCTA","CTGAGA");

    @Test
    public void testCreateAnalysisWithSimianSequence() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        boolean isSimian = calculatorService.verifyTypeDna(SIMIAN_SEQUENCE);
        assertTrue(isSimian, "Must be simian Clone");
    }
    @Test
    public void testCreateAnalysisWithHumanSequence() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        boolean isSimian = calculatorService.verifyTypeDna(HUMAN_SEQUENCE);
        assertFalse(isSimian, "Must be HUMAN");
    }
}