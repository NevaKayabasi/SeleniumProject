package com.cydeo.tests.day6_alerts_iframes_windows;



import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class T5_Windows_practices {

    WebDriver driver;


    @BeforeMethod
    private void setUpMethod() {


        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/windows ");

    }

    @Test
    public void multiple_window_test(){

      String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

//
// 4. Assert: Title is “Windows”

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

        System.out.println("Title before click :" +actualTitle);


// 5. Click to: “Click Here” link



        WebElement clickHereText = driver.findElement(By.linkText("Click Here"));
        clickHereText.click();


//6. Switch to new Window.
        for (String each : driver.getWindowHandles() ) {

            driver.switchTo().window(each);
            System.out.println("Current title when switching the windows :" + driver.getTitle());

        }


//7. Assert: Title is “New Window”
        String  expectedTitleAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);


        actualTitle = driver.getTitle();

        System.out.println("Title after click " +actualTitle);

        //if we want to go back main window
        //driver.switchTo().window(mainHandle);
    }

@AfterMethod
    public void tearDownMethod(){

        driver.quit();
}



}
