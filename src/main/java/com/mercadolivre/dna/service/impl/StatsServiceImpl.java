package com.mercadolivre.dna.service.impl;

import com.mercadolivre.dna.dto.StatsResponseDto;
import com.mercadolivre.dna.enumerator.DnaType;
import com.mercadolivre.dna.repository.StatsRepository;
import com.mercadolivre.dna.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 *  stats service impl
 *
 */
@Service
public class StatsServiceImpl implements StatsService {
    @Autowired
    private StatsRepository statsRepository;

    public StatsServiceImpl(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    /**
     * get stats
     *
     * @return {@link StatsResponseDto}
     * @see StatsResponseDto
     */
    public StatsResponseDto getStats(){
        int totalOfSimians = statsRepository.countByDnaType(DnaType.SIMIAN);
        int totalOfHumans = statsRepository.countByDnaType(DnaType.HUMAN);
        BigDecimal numero = new BigDecimal(totalOfSimians);
        BigDecimal ratio = numero.divide(new BigDecimal(totalOfHumans));
        return StatsResponseDto.builder()
                .countSimianDna(totalOfSimians)
                .countHumanDna(totalOfHumans)
                .ratio(ratio.doubleValue() * 100)
                .build();
    }

    public static void main(String[] args) {
        BigDecimal numero = new BigDecimal(1);
        BigDecimal ratio = numero.divide(new BigDecimal(0));
        Math.s

    }

}
