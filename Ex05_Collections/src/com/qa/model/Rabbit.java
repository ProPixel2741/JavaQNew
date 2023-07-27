package com.qa.model;

public class Rabbit extends Animal {
    private String name;
    private int age;

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Snuffle Snuffle";
    }

    @Override
    public String move() {
        return "Hop Hop";
    }
}
