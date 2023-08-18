package org.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    @BeforeEach
    public void BeforeEach(){
        System.setProperty("webdriver.chrome.driver", "C:\\driversWeb\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://the-internet.herokuapp.com/");
    }

    @AfterEach
    public void AfterEach(){
        driver.quit();
    }
}
