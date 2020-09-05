package com.learn.dbs;

public class EmployeeBuilderTest {

    public static void main(String[] args) {

        EmployeeBuilder employeeBuilder = new EmployeeBuilder
                .Builder()
                .name("name")
                .salary(123.45f)
                .experience(2)
                .build();
        System.out.println(employeeBuilder);
        //        EmployeeBuilder employeeBuilder1 = new EmployeeBuilder();
        //        EmployeeBuilder employeeBuilder1 = new EmployeeBuilder("name",123.45f,2);
    }
}
