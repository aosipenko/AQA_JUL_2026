package org.prog.session20.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.prog.session17.dto.NameDto;
import org.prog.session17.dto.PersonDto;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class TestDataSteps {

    public static PersonDto personData;

    @Given("Generate account first name {string} last name {string}")
    public void generateAccount(String firstName, String lastName) {
        System.out.println("Generate account " + firstName + " " + lastName);
    }

    @Given("With age {int}")
    public void withAge(int age) {
        System.out.println("With age " + age);
    }

    @Given("Data table list example")
    public void dataTableListExample(DataTable dataTable) {
        List<String> strings = dataTable.asList();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Given("Create custom person as {string}")
    public void dataTableMapExample(String alias, DataTable dataTable) {
        PersonDto personDto = new PersonDto();
        NameDto nameDto = new NameDto();
        nameDto.setFirst(dataTable.asMap().get("FirstName"));
        nameDto.setLast(dataTable.asMap().get("LastName"));
        nameDto.setTitle(dataTable.asMap().get("Title"));
        personDto.setName(nameDto);
        personDto.setNat(dataTable.asMap().get("Nat"));
        personDto.setGender(dataTable.asMap().get("Gender"));

        DataHolder.data.put(alias, personDto);
    }

    @Given("Random failure")
    public void randomFailure() {
        Random random = new Random();
        int i = random.nextInt(100);
        Assert.assertTrue(i > 20, "i was less than 20");
    }
}
