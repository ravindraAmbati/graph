package com.learn.dbs;

import java.util.Objects;

public final class EmployeeImmutable {

    private final String name;
    private final float salary;
    private final int experience;

    public EmployeeImmutable(String name, float salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public float getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeImmutable employee = (EmployeeImmutable) o;
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
}
