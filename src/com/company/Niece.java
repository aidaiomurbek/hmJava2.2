package com.company;

public class Niece extends Father implements Printable{
    private int salary;

    public Niece(String name, int age,int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()+"age: "+getAge()+salary);
    }
}
