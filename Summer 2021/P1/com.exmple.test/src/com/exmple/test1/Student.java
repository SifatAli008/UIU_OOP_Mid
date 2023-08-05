package com.exmple.test1;

import com.exmple.test.Address;
import com.exmple.test.Person;

public class Student extends Person {

    Student(String name, int age, Address address) {
        super(name, age, address);
    }

    public void print() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
         System.out.println("Address : " +getCity() + ", " + getPostcode());
    }
}
