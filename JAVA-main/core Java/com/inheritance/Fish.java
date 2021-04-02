package com.inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int weight, int size, int brain, int body, int gills, int eyes, int fins) {

        super(name, weight, 1, brain, 1);

        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest()
    {

    }
    private void movemuscles()
    {

    }

    private void swim()
    {
        movemuscles();
        movebackfin();
        move(2);
    }

    private void movebackfin()
    {

    }

}
