package com.mercadolivre.dna.repository;

import com.mercadolivre.dna.model.Nucleo;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends Neo4jRepository<Nucleo, String> {

}
