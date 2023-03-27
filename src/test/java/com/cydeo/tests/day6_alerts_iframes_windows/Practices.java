package com.cydeo.tests.day6_alerts_iframes_windows;

import com.beust.ah.A;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class Practices {

   public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }




    @Test

    public void dropdown_task5()  {

        //we located dropdown, ready to use
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//3. Select Illinois

        stateDropDown.selectByVisibleText("Illinois");
                                                             //the best one is selectByVisibleText
//4. Select Virginia

        stateDropDown.selectByValue("VA");

//5. Select California

        stateDropDown.selectByIndex(5);

//6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText =stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedOptionText,actualOptionText);

}



@Test
    public void dropDownTask6(){

//TC #6: Selecting date on dropdown and verifying
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com/dropdown                        YUKARIDA ACTIK
//3. Select “December 1st, 1923” and verify it is selected.

    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));



//Select year using : visible text

    yearDropdown.selectByVisibleText("1924");

//Select month using : value attribute
    monthDropdown.selectByValue("11");


//Select day using : index number
    dayDropdown.selectByIndex(0);

//creating expected values

  String expectedYear = "1924";
    String expectedMonth= "December";
    String expectedYDay = "1";

 //getting actual values from browser


    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();

    // create assertions

    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertTrue(actualMonth.equals(expectedMonth));
    Assert.assertTrue(actualDay.equals(actualDay));

}




    }