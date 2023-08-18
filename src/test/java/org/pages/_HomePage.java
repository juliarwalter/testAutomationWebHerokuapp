package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _HomePage {

    private WebDriver driver;

    public _HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ABTesting clickABTesting(){
        driver.findElement(By.cssSelector("[href='/abtest']"));
        return new ABTesting(driver);
    }
}
