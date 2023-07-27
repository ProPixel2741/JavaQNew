package com.qa.model;

public class Dog extends Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "I missed you so much.";
    }

    @Override
    public String move() {
        return "I love going for a walk!";
    }
}
