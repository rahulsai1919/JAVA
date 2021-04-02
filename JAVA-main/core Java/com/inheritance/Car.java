package com.inheritance;

public class Car extends Vehicle{

    private String brand;
    private int gears;
    private int doors;
    private boolean isManual;

    private int currentgear;

    public Car(String name, int wheels, String typeofgas, String brand, int gears, int doors, boolean isManual) {
        super(name, 4, typeofgas);
        this.brand = brand;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.currentgear = 0;
    }

    public void gearUp()
    {
        if(currentgear < gears) {
            currentgear += 1;
            System.out.println("geared up current gear - " + currentgear);
        }
        else
            System.out.println("max gear reached");
    }

    public void movefaster(int speedtoincreasse)
    {
        if(speedtoincreasse > 10)
            gearUp();
        this.setCurrentspeed(this.getCurrentspeed() + speedtoincreasse);
        System.out.println("speed increased by " + speedtoincreasse + " current speed " + this.getCurrentspeed());
    }

    public void moveslower(int speedtodecrease)
    {
        //if(speedtodecrease >= 10)
        this.setCurrentspeed(this.getCurrentspeed() - speedtodecrease);
        System.out.println("speed decreased by " + speedtodecrease + " current speed " + this.getCurrentspeed());
    }

}
