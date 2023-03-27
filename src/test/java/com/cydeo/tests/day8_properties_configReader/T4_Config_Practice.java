package com.cydeo.tests.day8_properties_configReader;

import com.cydeo.utilities.Configuration_Reader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

 /* public  WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        String browserType = Configuration_Reader.getProperty("browser");

        //We are getting the browserType dynamically from our configuration.properties file
        driver = WebDriverFactory.getDriver(Configuration_Reader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
*/
    @Test
    public void google_search(){

      //Driver.getDriver()-----> eskiden driver yazdigimiz her yere

       Driver.getDriver().get("https://www.google.com");
//3- Write “apple” in search box
        WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']/div[@class='QS5gu sy4vM']"));
        acceptButton.click();


        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(Configuration_Reader.getProperty("searchValue") + Keys.ENTER);


//4- Verify title:
//Expected: apple - Google Search

        String expectedTitle = Configuration_Reader.getProperty("searchValue")+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


    }





}
