package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    WebElement invalidMessage;
    WebElement userName;
    WebElement password;


    public Loginpage(WebDriver driver) {
        userName = driver.findElement(By.id("username"));
        password = driver.findElement(By.id("password"));
        invalidMessage = driver.findElement(By.id("flash"));

    }
    public void accessClearchannelLoginpage(WebDriver driver){
        driver.get("http://the-internet.herokuapp.com/login");

    }

}
