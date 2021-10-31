package com.mercadolivre.dna.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.IOException;

@DataNeo4jTest
@Testcontainers
@Transactional(propagation = Propagation.NEVER)
@Slf4j
public class StatsRepositoryTest {

    @Autowired
    private StatsRepository repository;
    @BeforeEach
    public void setup() throws IOException {
        log.debug("running setup.....,");
        this.repository.deleteAll();// to make the tests work
    }

}