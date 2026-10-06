package org.prog.session20.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.session16.page.GooglePage;
import org.prog.session17.dto.PersonDto;
import org.testng.Assert;

public class WebSteps {

    public static GooglePage googlePage;

    @Given("I load google page")
    public void loadGooglePage() {
        googlePage.loadPage();
        googlePage.acceptCookies();
    }

    @When("I set google page search to {string} first and last name")
    public void setGoogleSearch(String alias) {
        PersonDto personDto = (PersonDto) DataHolder.data.get(alias);
        String firstName = personDto.getName().getFirst();
        String lastName = personDto.getName().getLast();
        googlePage.setSearchFieldValue(firstName + " " + lastName);
    }

    @Then("Google has {string} first and last name in search input")
    public void assertGoogleSearchValue(String alias) {
        PersonDto personDto = (PersonDto) DataHolder.data.get(alias);
        String firstName = personDto.getName().getFirst();
        String lastName = personDto.getName().getLast();
        Assert.assertEquals(googlePage.getSearchFieldValue(), firstName + " " + lastName);
    }
}
