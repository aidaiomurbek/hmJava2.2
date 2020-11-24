package com.company;

public class Son extends Father implements Printable{
    private int school;

    public Son(String name, int age,int school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()+"age: "+getAge()+"school: "+school);
    }
}
