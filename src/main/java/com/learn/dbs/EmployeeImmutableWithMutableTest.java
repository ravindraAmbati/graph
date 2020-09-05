package com.learn.dbs;

import java.util.List;

public class EmployeeImmutableWithMutableTest {

    public static void main(String[] args) {
        Address address = new Address(123456);
        EmployeeImmutableWithMutable employeeImmutableWithMutable
                = new EmployeeImmutableWithMutable("name",123.456f,9, List.of(address));
        System.out.println(employeeImmutableWithMutable);
        employeeImmutableWithMutable.getAddresses().add(new Address(456));
        System.out.println(employeeImmutableWithMutable);
        employeeImmutableWithMutable.getAddresses().add(new Address(98465));
        System.out.println(employeeImmutableWithMutable);
        address.setZipCode(0);
        employeeImmutableWithMutable.getAddresses().add(new Address(6935));
        System.out.println(employeeImmutableWithMutable);
    }
}
