package stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver myDriver;
    @Before
    public void beforeTest(Scenario scr){
        System.setProperty("webdriver.chrome.driver","D://Data//ClearChannel//src//test//chromedriver.exe");
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }

    @After
    public void afterTest(){
//        myDriver.quit();

    }
}
