package com.mercadolivre.api;

import com.mercadolivre.dna.dto.DnaCreateRequestDto;
import com.mercadolivre.dna.dto.DnaCreateResponseDto;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CucumberDnaFeatures {
    @ParameterType(name = "dna",value = "(.*)")
    public List<String> dna(String dna) {
        return List.of(dna.split(","));
    }

    @Autowired
    private CucumberDnaControllerClient client;

    private Boolean returnedIsSimian = false;
    @Given("the client send a sequence {dna}")
    public void the_client_send_a_sequence(List<String> dna) {
        log.info(dna.toString());
        ResponseEntity<DnaCreateResponseDto> response = client.analiseDna(DnaCreateRequestDto.builder()
                .bases(dna)
                .build());
        returnedIsSimian = response.getBody().getIsSimian();
    }

    @When("the api response should be (.*)")
    public void the_api_response_should_be(String simian) {
        log.info(simian);
        assertEquals(Boolean.valueOf(simian), returnedIsSimian);
    }


//    @When("^I put (\\d+) (\\w+) in the bag$")
//    public void i_put_something_in_the_bag(final int quantity, final String something) {
//        IntStream.range(0, quantity)
//                .peek(n -> log.info("Putting a {} in the bag, number {}", something, quantity))
//                .map(ignore -> client.analiseDna(something))
//                .forEach(statusCode -> assertThat(statusCode).isEqualTo(HttpStatus.CREATED.value()));
//    }
//
//    @Then("^the bag should contain only (\\d+) (\\w+)$")
//    public void the_bag_should_contain_only_something(final int quantity, final String something) {
//        assertNumberOfTimes(quantity, something, true);
//    }
//
//    @Then("^the bag should contain (\\d+) (\\w+)$")
//    public void the_bag_should_contain_something(final int quantity, final String something) {
//        assertNumberOfTimes(quantity, something, false);
//    }
//    private void assertNumberOfTimes(final int quantity, final String something, final boolean onlyThat) {
//        final List<String> things = bagHttpClient.getContents().getThings();
//        log.info("Expecting {} times {}. The bag contains {}", quantity, something, things);
//        final int timesInList = Collections.frequency(things, something);
//        assertThat(timesInList).isEqualTo(quantity);
//        if (onlyThat) {
//            assertThat(timesInList).isEqualTo(things.size());
//        }
//    }



}
