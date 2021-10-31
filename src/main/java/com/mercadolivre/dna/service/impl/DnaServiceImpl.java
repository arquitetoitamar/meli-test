package com.mercadolivre.dna.service.impl;

import com.mercadolivre.dna.dto.DnaCreateRequestDto;
import com.mercadolivre.dna.dto.DnaCreateResponseDto;
import com.mercadolivre.dna.enumerator.DnaType;
import com.mercadolivre.dna.model.Codon;
import com.mercadolivre.dna.model.Nucleo;
import com.mercadolivre.dna.repository.StatsRepository;
import com.mercadolivre.dna.service.CalculatorService;
import com.mercadolivre.dna.service.DnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DnaServiceImpl implements DnaService {
    @Autowired
    private StatsRepository statsRepository;

    private CalculatorService coreCalculator;
    @Autowired
    public DnaServiceImpl(StatsRepository statsRepository, CalculatorServiceImpl coreCalculator) {
        this.statsRepository = statsRepository;
        this.coreCalculator = coreCalculator;
    }

    public DnaCreateResponseDto createAnalysis(DnaCreateRequestDto dna) {
        String sequence = dna.getBases().stream().collect(Collectors.joining());
        boolean simian = coreCalculator.verifyTypeDna(sequence);
        Nucleo nucleo = statsRepository.save(Nucleo.builder()
                .dnaSequence(sequence)
                .tape(dna.getBases().stream().map(Codon::new)
                        .collect(Collectors.toList()))
                .dnaType(DnaType.valueOf(simian))
                .build());
        return DnaCreateResponseDto.builder()
                .isSimian(nucleo.getDnaType().equals(DnaType.SIMIAN))
                .build();
    }
}
