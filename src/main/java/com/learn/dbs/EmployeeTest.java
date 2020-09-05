package com.learn.dbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("abc", 123.456f, 2);
        Employee e2 = new Employee("zsd", 45.8f, 1);
        Employee e3 = new Employee("zz", 78988.5554f, 25);
        Employee e4 = new Employee("ghy", 1234567.0f, 10);
        Employee e5 = new Employee("aaa", 100.56f, 2);
        Employee e6 = new Employee("aaa", 100.56f, 2);
        Employee e7 = new Employee("aaa", 100.56f, 3);
        Employee e8 = new Employee("zsd", 100.56f, 1);
        Employee e9 = new Employee("zsz", 45.8f, 1);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        employeeList.add(e9);
        System.out.println("List of Employees");
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by name");
        Collections.sort(employeeList);
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by experience");
        employeeList.sort(Comparator.comparingInt(Employee::getExperience));
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by highest experience");
        employeeList.sort(Comparator.comparingInt(Employee::getExperience).reversed());
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by salary");
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by highest salary");
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println(employeeList);
        System.out.println("List of Employees: sort by highest salary then lowest experience and then name");
        employeeList.sort(
                Comparator
                        .comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getExperience)
                        .thenComparing(Employee::compareTo));
        System.out.println(employeeList);
    }
}
