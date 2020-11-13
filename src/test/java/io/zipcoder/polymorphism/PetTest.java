package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public  void ConstructorNullTest(){
        //given
        Pet p = new Pet();
        //Then
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public  void ConstructorNameTest(){
        //given
        String expectedName = "Machina";
        Pet p = new Pet(expectedName);
        //when
        String actualName = p.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public  void setNameTest(){
        //given
        Pet p = new Pet("Machina");
        String expectedName = "Tidus";
        //when
        p.setName(expectedName);
        String actualName = p.getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }
}