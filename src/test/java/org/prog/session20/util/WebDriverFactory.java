package org.prog.session20.util;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class WebDriverFactory {

    @SneakyThrows
    public static WebDriver getDriver() {
        String envType = System.getProperty("envType", "jenkins");
        if (envType.equalsIgnoreCase("jenkins")) {
            return new RemoteWebDriver(new URL("http://selenium-hub:4444/"), new ChromeOptions());
        } else {
            return new ChromeDriver(new ChromeOptions());
        }
    }
}
