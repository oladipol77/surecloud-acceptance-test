package com.surecloud.ui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class Login
{
    private WebDriver webDriver;

    @Before
    public void setupWebDriver()
    {
        WebDriverManager.chromedriver()
                        .setup();

        webDriver = new ChromeDriver();
    }

    @Given("user is on the SureCloud login page")
    public void userIsOnTheSureCloudLoginPage () {

        webDriver.get("https://qa-interview-service.public.test.uk.surecloud.com/login");


    }


    @When("user enter {string} {string}")
    public void userEnter (String Email, String Password){

        webDriver.findElement(By.id("email")).sendKeys(Email);
        webDriver.findElement(By.id("password")).sendKeys(Password);
    }

   @And("user clicks on LOG IN button")
    public void userClicksOnLOGINButton () {

        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div[2]/form/button/span")).click();
    }

    @Then("SureCloud home page should be displayed")
    public void surecloudHomePageShouldBeDisplayed () {

        String expectedResult = "SureCloud QA Interview Task | Login";
        String actualResult = webDriver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);

    }
        @After
        public void tearDownWebDriver ()
        {
            if (webDriver.manage() != null) {
                webDriver.quit();
            }
        }



}



