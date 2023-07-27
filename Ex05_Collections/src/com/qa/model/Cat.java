package com.qa.model;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh it's you, says: " + getName();
    }

    @Override
    public String move() {
        return "Fine...";
    }
}
