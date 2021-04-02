package com.inheritance;

public class Vehicle {
    private String name;
    private int wheels;
    private String typeofgas;
    private int currentspeed;
    private String direction;
    private int steerangle;

    public Vehicle(String name, int wheels, String typeofgas) {
        this.name = name;
        this.wheels = wheels;
        this.typeofgas = typeofgas;
        this.currentspeed = 0;
        this.direction = "straight";
        this.steerangle = 0;

    }

    public void steer(int steerangle)
    {
        this.steerangle = steerangle;
        System.out.println("steered " + steerangle + " degrees to change direction");
    }

    public void move(String direction, int speed)
    {
        this.direction = direction;
        this.currentspeed += speed;
        if(direction.equals("left"))
            steer(-90);
        else if(direction.equals("right"))
            steer(90);
        else if(direction.equals("uturn"))
            steer(180);
        System.out.println(this.name + " is moving in direction " + direction + " with speed " + speed);
    }

    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String getTypeofgas() {
        return typeofgas;
    }

    public int getCurrentspeed() {
        return currentspeed;
    }

    public String getDirection() {
        return direction;
    }

    public int getSteerangle() {
        return steerangle;
    }
}
