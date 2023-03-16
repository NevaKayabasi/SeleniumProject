package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_alert_ptactices {

    WebDriver driver;


    @BeforeMethod
    private  void setUpMethod(){


 //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alert_T1(){

//3.Click to "Click JS Alert" button

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertButton.click();


        //to be able to click to Alert OK button we need to switch driver's focus to alert
        Alert alert = driver.switchTo().alert();

//4.Click to OK button from the alert

        alert.accept();

//5.Verify "You successfully clicked an alert" text is displayed

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText,expectedText,"Actual result text is not expected!!");

    }
}
