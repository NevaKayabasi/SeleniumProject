package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    //#1- create constructor and isntantiate driver and object of the class

    public DynamicLoad7Page(){

        PageFactory.initElements(Driver.getDriver(),this);
        //after this line object of this class is capable of carrying the current driver instance in itself
    }

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMessage;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImage;

}
