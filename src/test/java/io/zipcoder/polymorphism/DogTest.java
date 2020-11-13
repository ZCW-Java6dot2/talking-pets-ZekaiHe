package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public  void ConstructorTest(){
        //given
        String expectedName = "Momo";
        Dog d = new Dog(expectedName);
        //when
        String actualName = d.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
}