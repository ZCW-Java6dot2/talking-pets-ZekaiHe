package io.zipcoder.polymorphism;
import java.util.ArrayList;
import java.util.Arrays;

public class Pet{
    String name;
    Integer age;

    public Pet(){
    }

    public Pet(String name){
        this.name = name;
    }

    public Pet(Integer age){
        this.age = age;
    }

    public Pet (String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String speak(){
        return "Pet speaks";
    }
}
