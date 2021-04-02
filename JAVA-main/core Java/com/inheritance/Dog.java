package com.inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;

    private int teeth;
    private  String coat;

    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, weight, size, 1, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew()
    {
        System.out.println(this.getName() + " is chewing");
        eat();
    }

    public void walk()
    {
        System.out.println(this.getName() + " is walking");
        move(5);
    }

    public void run()
    {
        System.out.println(this.getName() + " is running");
        move(10);
    }



}


