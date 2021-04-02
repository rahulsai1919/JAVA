package inheritance;

class Animal {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    Animal()
    {
        legs = 2;
    }
    void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    void eat()
    {
        System.out.println("animal is eating");
    }

    void move()
    {
        System.out.println("animal is moving");
    }
    void makesound()
    {
        System.out.println("animal is making sounds");
    }


}
class Dog extends Animal{

    private String name;
    Dog(String name)
    {
        super(4);
        this.name = name;
    }
    Dog()
    {
        super(4);
        this.name = "dog";
    }
    private void bark(){
        System.out.println("bow bow");
    }
    private void run()
    {
        System.out.println("dog is running");
    }
    void eat() {
        System.out.println("dog is eating meat");
    }
    void makesound() {
        bark();
    }
    void move() {
        run();
    }
}

class Monkey extends Animal{

    private int hands;
    private int tail;

    Monkey()
    {
        tail = 0;
        hands = 2;
    }
    private void climb()
    {
        System.out.println("monkey is climbing");
    }
    private void walk()
    {
        System.out.println("monkey is walking");
    }
    void move()
    {
        walk();
        climb();
    }
    void eat()
    {
        System.out.println("moonkey is eating banana");
    }

}
public class Animals{

    public static void main(String[] args) {
        Dog d1 = new Dog("tommy");
        d1.makesound();
        d1.move();
        d1.eat();

        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.move();

    }
}
