package com.mercadolivre.dna.repository;

import com.mercadolivre.dna.enumerator.DnaType;
import com.mercadolivre.dna.model.Nucleo;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatsRepository extends Neo4jRepository<Nucleo, String> {
    List<Nucleo> findByDnaType(DnaType dnaType);
    int countByDnaType(DnaType dnaType);
}
