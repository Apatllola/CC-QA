package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginStepDefintion {

    static WebDriver myDriver;

    @Given("^I have accessed \"([^\"]*)\"$")
    public void i_have_accessed_http_the_internet_herokuapp_com_login(String websiteUrl)  {
        System.setProperty("webdriver.chrome.driver", "D://Data//ClearChannel//src//test//chromedriver.exe");
        myDriver = new ChromeDriver();
        myDriver.get(websiteUrl);

    }

    @When("^I enter valid username \"([^\"]*)\", password \"([^\"]*)\"$")
    public void i_enter_valid_username_password(String userName, String password) {
        myDriver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        myDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        myDriver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

    }
    @When("^I enter in valid username \"([^\"]*)\", password \"([^\"]*)\"$")
    public void i_enter_in_valid_username_password(String userName, String password) {
        myDriver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        myDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        myDriver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();


    }
    @Then("^I will see home page displayed$")
    public void i_will_see_homepage_displayed(){
        Assert.assertEquals(true,myDriver.findElement(By.xpath("//h4[contains(text(),'Welcome')]")).isDisplayed());
    }

    @Then("^I will see login error message$")
    public void i_will_see_error_displayed(){
        Assert.assertEquals(true,myDriver.findElement(By.xpath("//div[contains(text(),'invalid')]")).isDisplayed());
    }


}