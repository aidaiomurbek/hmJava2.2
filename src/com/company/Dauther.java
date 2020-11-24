package com.company;

public class Dauther extends Father implements Printable{
    private String bag;

    public Dauther(String name, int age,String bag) {
        super(name, age);
        this.bag = bag;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()+"age: "+getAge()+bag);
    }
}
