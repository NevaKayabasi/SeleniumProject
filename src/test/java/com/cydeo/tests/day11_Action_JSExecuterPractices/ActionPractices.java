package com.cydeo.tests.day11_Action_JSExecuterPractices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_test(){

        //TC #4: Scroll practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

//3- Scroll down to “Powered by CYDEO”
//Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

//Locating cydeo link to be able to pass in the actions method
//a[@href='https://cydeo.com/']

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLink).perform();

//5- Scroll back up to “Home” link using PageUP button

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();


     Driver.closeDriver();



    }

    @Test
    public void test2(){

        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }
    }