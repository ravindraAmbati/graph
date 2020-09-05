package com.learn.dbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class EmployeeImmutableWithMutable {

    private final String name;
    private final float salary;
    private final int experience;
    private final List<Address> addresses;

    public EmployeeImmutableWithMutable(String name, float salary, int experience, List<Address> addresses) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.addresses = new ArrayList<>(addresses);
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return new ArrayList<>(addresses);
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

        EmployeeImmutableWithMutable employee = (EmployeeImmutableWithMutable) o;
        return Objects.equals(name,employee.name)&& Objects.equals(salary,employee.salary) && Objects.equals(experience,employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,salary,experience);
    }

    @Override
    public String toString() {
        return "EmployeeImmutableWithMutable{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ", addresses=" + addresses +
                '}';
    }
}
