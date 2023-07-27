package com.qa;

public class Main {
    public static void main(String[] args) {
        //Rectangle Objects and Stuff
        Rectangle r = new Rectangle("rectangle1", "yellow",
                0,0,10,10);
        Rectangle r2 = new Rectangle("rectangle2", "green",
                2,2,5,2);
        System.out.println(r.toString());
        System.out.println(r2.toString());
        System.out.println("Area of r is: " + r.getArea() + ".");
        System.out.println("Centre point of r is: " + r.getCentrePoint() + ".");
        System.out.println("Is r square? " + r.isSquare());
        System.out.println("Area of r2 is: " + r2.getArea() + ".");
        System.out.println("Centre point of r2 is: " + r2.getCentrePoint() + ".");
        System.out.println("Is r2 square? " + r2.isSquare());

        //Circle Objects and Stuff
        Circle c = new Circle("circle1", "red", 0, 0, 10);
        Circle c2 = new Circle("circle2", "blue", 10, 10, 5);
        System.out.println(c.toString());
        System.out.println(c2.toString());
        System.out.println("Area of c is: " + c.getArea());
        System.out.println("Centre Point of c is: " + c.getCentrePoint());
        System.out.println("Area of c2 is: " + c2.getArea());
        System.out.println("Centre Point of c2 is: " + c2.getCentrePoint());
    }
}
