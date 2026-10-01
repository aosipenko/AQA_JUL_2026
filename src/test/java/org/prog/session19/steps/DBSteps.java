package org.prog.session19.steps;

import io.cucumber.java.en.Given;
import lombok.SneakyThrows;
import org.prog.session17.dto.NameDto;
import org.prog.session17.dto.PersonDto;
import org.prog.session17.dto.ResultsDto;
import org.testng.Assert;

import java.sql.*;

public class DBSteps {

    public static Connection connection;
    public static String firstLastName;
    private String insertSQL =
            "INSERT INTO Persons (FirstName, LastName, Gender, Title, Nat) VALUES (?, ?, ?, ?, ?)";

    @SneakyThrows
    @Given("I store {string} people to DB")
    public void storePeopleToDB(String alias) {
        PreparedStatement stmt = connection.prepareStatement(insertSQL);
        ResultsDto resultsDto = (ResultsDto) DataHolder.data.get(alias);
        for (PersonDto personDto : resultsDto.getResults()) {
            try {
                stmt.setString(1, personDto.getName().getFirst());
                stmt.setString(2, personDto.getName().getLast());
                stmt.setString(3, personDto.getGender());
                stmt.setString(4, personDto.getName().getTitle());
                stmt.setString(5, personDto.getNat());
                stmt.execute();
            } catch (SQLException ex) {
                System.out.println("Failed to save person: " + personDto);
            }
        }
    }

    @Given("I pick random person form DB as {string}")
    public void pick1RandomPersonFormDB(String alias) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Persons ORDER BY RAND() LIMIT 1");
        if (rs.next()) {
            PersonDto personDto = new PersonDto();
            NameDto nameDto = new NameDto();
            nameDto.setTitle(rs.getString("Title"));
            nameDto.setFirst(rs.getString("FirstName"));
            nameDto.setLast(rs.getString("LastName"));
            personDto.setName(nameDto);
            personDto.setGender(rs.getString("Gender"));
            personDto.setNat(rs.getString("Nat"));
            DataHolder.data.put(alias, personDto);
        } else {
            Assert.fail("No records are present in DB");
        }
    }
}
