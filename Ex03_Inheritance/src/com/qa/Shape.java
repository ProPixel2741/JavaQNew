package com.qa;
public abstract class Shape {
    //All fields automatically given to classes that implement this class
    private String name;
    private String colour;
    private double x,y;

    public Shape(String name, String colour, double x, double y) {
        this.name = name;
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    //These are also given, and can be called
    public String getName() { return name; }
    public void setName() { this.name = name; }
    public String getColour() { return colour; }
    public void setColour() { this.colour = colour; }
    public double getX() { return x; }
    public void setX() { this.x = x; }
    public double getY() { return y; }
    public void setY() { this.y = y; }

    //These are not 1-size-fits-all for the different shapes
    public abstract double getArea();
    public abstract Point getCentrePoint();
}
