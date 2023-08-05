package com.exmple.test;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    Person() {
        name = "Tamim Iqbal";
        age = 35;
        address = new Address();
        address.postcode = 1200;
        address.city = "Dhaka";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return address.city;
    }

    public int getPostcode() {
        return address.postcode;
    }

}
