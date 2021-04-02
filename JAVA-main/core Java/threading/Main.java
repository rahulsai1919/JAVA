package threading;

public class Main {

    public static void main(String[] args) {
        Display d = new Display();
        Newthread t1 = new Newthread(d,"rahul");
        Newthread t2 = new Newthread(d,"naren");
        Newthread t3 = new Newthread(d,"rakesh");
        Newthread t4 = new Newthread(d,"deeraj");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}