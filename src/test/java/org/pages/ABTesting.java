package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTesting {

    private WebDriver driver;

    public ABTesting(WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        String message = driver.findElement(By.cssSelector("#content > div > p")).getText();
        return message;
    }
}
