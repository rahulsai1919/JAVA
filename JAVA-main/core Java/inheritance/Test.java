package inheritance;

interface Vehicle{
    void move();
    void speedUp(int speed);
    void speedDown(int speed);
    void stop();
}

class Car implements Vehicle
{
    private int gears;
    private int currentGear;
    private int currentSpeed;
    private boolean isStarted = false;
    Car(int gears)
    {
        this.gears = gears;
        this.currentGear = 0;
        this.currentSpeed = 0;
    }
    private void start()
    {
        isStarted = true;
        System.out.println("car is started");
    }
    @Override
    public void move() {
        if(currentSpeed == 0) {
            this.start();
            speedUp(5);
            System.out.println("car started moving with speed " + currentSpeed + " kmph");
        }
        else
            System.out.println("car is already moving");
    }

    @Override
    public void speedUp(int speed) {
        if(currentSpeed < 200)
        {
            if(currentGear < gears)
            {
                currentGear++;
                currentSpeed += speed;
            }
            else
                currentSpeed += speed;
            if(currentSpeed > 200)
                currentSpeed = 200;
            System.out.println("speed increased, current speed : " + currentSpeed);
        }
        else
            System.out.println("Max speed reached");

    }

    @Override
    public void speedDown(int speed) {
        if(speed > 0)
        {
            if(currentGear>0){
                currentSpeed -= speed;
                currentGear--;
            }
            else
                currentSpeed -= speed;
            if(currentSpeed <0)
                currentSpeed = 0;
            System.out.println("speed decreased, current speed : " + currentSpeed);
        }
        else
            System.out.println("Min speed reached");
    }

    @Override
    public void stop() {
        currentSpeed = 0;
        currentGear = 0;
        System.out.println("car stopped");
    }
}

public class Test{
    public static void main(String[] args) {
        Vehicle car = new Car(5);
        car.move();
        car.speedUp(20);
        car.speedDown(10);
        car.stop();
    }
}
