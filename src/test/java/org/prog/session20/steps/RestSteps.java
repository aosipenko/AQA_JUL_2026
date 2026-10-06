package org.prog.session20.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import org.prog.session17.dto.ResultsDto;

public class RestSteps {

    @Given("I request {int} random people from service as {string}")
    public void getRandomPeopleFromService(int amount, String alias) {
        ResultsDto resultsDto = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("/api")
                .header("Accept", "application/json")
                .queryParam("inc", "gender,nat,name")
                .queryParam("noinfo")
                .queryParam("results", amount)
                .get()
                .as(ResultsDto.class);
        DataHolder.data.put(alias, resultsDto);
    }
}
