
package threading;

class Mythread extends Thread
{
    static Thread mainthread;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            mainthread.join();
        }
        catch(InterruptedException ie)
        {
            System.out.println("IE catched");
        }
        for(int i=0;i<10;i++)
            System.out.println("child thread");
    }
}

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("thread created using runnable");
        }
    }
}

public class Demothread {

    public static void main(String[] args) throws InterruptedException{
        //Runnable r = new MyRunnable();
        Mythread.mainthread = Thread.currentThread();
        Mythread t = new Mythread();
        t.start();
        for(int i=0;i<10;i++)
        {
            Thread.sleep(1000);
            System.out.println("main");
        }
    }
}
