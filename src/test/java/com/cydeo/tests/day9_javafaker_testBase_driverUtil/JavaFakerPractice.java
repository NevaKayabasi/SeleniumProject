package com.cydeo.tests.day9_javafaker_testBase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test

    public void test1(){

        Faker faker = new Faker();
        //creatin faker object to reach methods

        //  Faker faker = new Faker("tr");  baska bir ulkeye locate yapabiliriz

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

//numerify generates random numbers
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));


        //return random letters
        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));


        System.out.println("faker.bothify(\"##??-##?\") = " + faker.bothify("##??-##?"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Neva"));


    }
}
