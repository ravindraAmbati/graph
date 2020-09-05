package com.learn.dbs;

public class EmployeeImmutableTest {

    public static void main(String[] args) {

        EmployeeImmutable e1 = new EmployeeImmutable("abc", 123.456f, 2);
        System.out.println(e1);
    }
}
