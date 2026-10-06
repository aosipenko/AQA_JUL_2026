package org.prog.session20;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.prog.session16.page.GooglePage;
import org.prog.session20.steps.DBSteps;
import org.prog.session20.steps.DataHolder;
import org.prog.session20.steps.WebSteps;
import org.prog.session20.util.DBConnectionFactory;
import org.prog.session20.util.WebDriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        glue = "org.prog.session20.steps",
        features = "src/test/resources/features",
        plugin = {
                "pretty", "html:target/report.html", "json:target/Cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @SneakyThrows
    @BeforeSuite
    public void connectToDB() {
        DBSteps.connection = DBConnectionFactory.getConnection();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");

        driver = WebDriverFactory.getDriver();
        WebSteps.googlePage = new GooglePage(driver);
    }

    @AfterMethod
    public void quitDriver() {
        DataHolder.data.clear();
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

    @SneakyThrows
    @AfterSuite
    public void closeDB() {
        if (DBSteps.connection != null) {
            DBSteps.connection.close();
        }
    }
}
