package com.ym.examples.java.api;

import com.ym.examples.scala.api.*;

/**
 * Created by hzyuemeng1 on 2016/8/29.
 */
public class TestDog
{
    public static void main(String[] args) {
        Dog dog = new Dog("Ease",20);
        System.out.println(getOldDog(dog));
    }
    public static String getOldDog(Dog dog){
        if(Dog.OldDog(dog)) {
           return dog.name();
        }
        return "Tom";
    }
}
