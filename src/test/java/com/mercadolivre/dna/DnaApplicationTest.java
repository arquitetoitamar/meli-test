package com.mercadolivre.dna;

import com.mercadolivre.dna.config.DatabaseConfigTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(properties = "classpath:application-test.yml")
@EnableConfigurationProperties
@ComponentScan(value ={"com.mercadolivre.dna"})
@ActiveProfiles("test")
@ContextConfiguration(classes = { DatabaseConfigTest.class })
@PropertySource(value = "classpath:application-test.yml")
public class DnaApplicationTest {
    @Test
    public void contextLoads() {
    }
}