package com.learn.dbs;

public class Counter  implements Runnable{

    private int c =0;

    @Override
    public void run() {
        synchronized (this){
            try {
                System.out.println("Thread: "+Thread.currentThread().getName()+"    Increment: "+ this.increment()+"    Decrement: "+ this.decrement());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void actualRun() {
        try {
            System.out.println("Thread: "+Thread.currentThread().getName()+"    Increment: "+ this.increment()+"    Decrement: "+ this.decrement());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int decrement() throws InterruptedException {
        Thread.sleep(3);
        return c--;
    }

    private int increment() throws InterruptedException {
        Thread.sleep(3);
        return c++;
    }
}
