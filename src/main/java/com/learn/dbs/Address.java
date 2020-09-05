package com.learn.dbs;

public class Address {
    private int zipCode;

    public Address(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return zipCode == address.zipCode;
    }

    @Override
    public int hashCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                '}';
    }
}
