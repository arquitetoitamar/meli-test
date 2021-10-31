package com.mercadolivre.dna.service.impl;

import com.mercadolivre.dna.dto.StatsResponseDto;
import com.mercadolivre.dna.repository.StatsRepository;
import com.mercadolivre.dna.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class StatsServiceImpl implements StatsService {

    private StatsRepository statsRepository;
    @Autowired
    public StatsServiceImpl(StatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }
    public StatsResponseDto getStats(){
        return (StatsResponseDto) this.statsRepository.findAll()
                .stream()
                .map(StatsResponseDto::new)
                .collect(Collectors.toList());
    }

}
