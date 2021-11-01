package com.mercadolivre.dna.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.neo4j.harness.Neo4j;
import org.neo4j.harness.Neo4jBuilders;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataNeo4jTest
@Transactional(propagation = Propagation.NEVER)
@Slf4j
@Profile("test")
public class DatabaseConfigTest {
    private static Neo4j embeddedDatabaseServer;
    @BeforeAll
    static void initializeNeo4j() {
        embeddedDatabaseServer = Neo4jBuilders.newInProcessBuilder()
                .withDisabledServer()//disable http server
                .build();
    }
    @DynamicPropertySource
    static void neo4jProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.neo4j.uri", embeddedDatabaseServer::boltURI);
        registry.add("spring.neo4j.authentication.username", () -> "neo4j");
        registry.add("spring.neo4j.authentication.password", () -> null);
    }
    @AfterAll
    static void stopNeo4j() {
        embeddedDatabaseServer.close();
    }
    @Test
    public void testCreate(){
        DatabaseConfig databaseConfig = new DatabaseConfig();
        assertNotNull(databaseConfig);
    }
}