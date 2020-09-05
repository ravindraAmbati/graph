package com.learn.dbs;

import java.util.Objects;

public class EmployeeBuilder {

    private final String name;
    private final float salary;
    private final int experience;

    private EmployeeBuilder(Builder builder) {
        this.name = builder.name;
        this.salary = builder.salary;
        this.experience = builder.experience;
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

        EmployeeBuilder employee = (EmployeeBuilder) o;
        return Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(experience, employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, experience);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public static final class Builder {

        private String name;
        private float salary;
        private int experience;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder salary(float salary) {
            this.salary = salary;
            return this;
        }

        public Builder experience(int experience) {
            this.experience = experience;
            return this;
        }

        public EmployeeBuilder build(){
            return new EmployeeBuilder(this);
        }
    }
}
