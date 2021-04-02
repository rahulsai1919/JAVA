package threading;

import threading.Display;

 class Newthread extends Thread{

    Display d;
    String name;
    Newthread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
