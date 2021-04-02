package com.inheritance;

public class  Animal{
    private String name;
    private  int weight;
    private int size;
    private int brain;
    private int body;



    public Animal(String name, int weight, int size, int brain, int body) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.brain = brain;
        this.body = body;
    }

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void move(int speed)
    {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getBrain() {
        return brain;
    }
    public int getBody() {
        return body;
    }
}



