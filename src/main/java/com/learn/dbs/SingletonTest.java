package com.learn.dbs;

public class SingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        Singleton otherSingleton = Singleton.getInstance();
        System.out.println(otherSingleton);
//        System.out.println(Singleton.getInstance().clone());
    }
}
