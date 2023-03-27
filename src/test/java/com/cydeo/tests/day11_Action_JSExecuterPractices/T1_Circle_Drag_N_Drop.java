package com.cydeo.tests.day11_Action_JSExecuterPractices;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class T1_Circle_Drag_N_Drop {

    @Test
    public void drag_N_drop_test(){

//TC #: Drag and drop
//1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptButton.click();

   //Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

//2. Drag and drop the small circle to bigger circle.

        Actions action = new Actions(Driver.getDriver());

       // action.dragAndDrop(smallCircle,bigCircle).perform();

        BrowserUtils.sleep(2);

        action.clickAndHold(smallCircle).pause(4000).moveToElement(smallCircle).release().perform();






//3. Assert:
//-Text in big circle changed to: “You did great!”


        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);




    }


}



//3. Assert:
//-Text in big circle changed to: “You did great!”