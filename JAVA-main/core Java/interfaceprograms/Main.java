package interfaceprograms;

public class Main {

    public static void main(String[] args) {
        X xx = new B();
        xx.m1();
        xx.m2();
    }

}

interface X
{
    public abstract void m1();
    public void m2();

}

abstract class A implements X
{
    @Override
    public void m1() {
        System.out.println("A's implementation of m1 in X");
    }

}

class B extends A
{
    @Override
    public void m2() {
        System.out.println("B's implementation of m2 in X");
    }
}
