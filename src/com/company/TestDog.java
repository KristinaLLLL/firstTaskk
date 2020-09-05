package com.company;

public class TestDog {
    public static void main(String[] args){
        Dog dog1=new Dog("Maks",3);
        Dog dog2=new Dog("Rube");
        dog2.setAge(5);
        System.out.println(dog1);
        System.out.println(dog2);
    }

}
