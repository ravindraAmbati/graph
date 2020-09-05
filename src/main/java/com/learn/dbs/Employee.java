package com.learn.dbs;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private String name;
    private float salary;
    private int experience;

    public Employee() {
    }

    public Employee(String name, float salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return Objects.equals(name,employee.name)&& Objects.equals(salary,employee.salary) && Objects.equals(experience,employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,experience);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
