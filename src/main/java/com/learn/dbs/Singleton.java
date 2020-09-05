package com.learn.dbs;

public class Singleton implements Cloneable {


    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
