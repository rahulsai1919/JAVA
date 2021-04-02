package threading;

class Mythread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("new thread created by extending thread class");
        }
    }
}

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("thread created using runnable");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        /* creating a new thread by extending Thread class */
        Thread t1 = new Mythread();
        /* creating a new thread by implementing runnable interface*/
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        /* starting the threads
         below start methods are inoked by Main Thread */
        t1.start();
        t2.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("main thread");
        }
    }
}
