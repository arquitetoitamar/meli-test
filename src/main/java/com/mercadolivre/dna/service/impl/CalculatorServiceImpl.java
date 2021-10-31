package com.mercadolivre.dna.service.impl;

import com.mercadolivre.dna.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements
        CalculatorService {

    @Override
    public boolean verifyTypeDna(String sequence) {

        return true;
    }
}

