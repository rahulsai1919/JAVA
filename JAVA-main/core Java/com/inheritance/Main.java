package com.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("john",10,5,1,1);

        Dog dog = new Dog("tommy",8,2,2,4,1,32,"silky");

        dog.chew();
        dog.walk();
        dog.run();

    }

}


