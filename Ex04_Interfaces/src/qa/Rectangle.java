package qa;

public class Rectangle extends Shape {
    private double x, y;
    private double width, height;

    public Rectangle (String name, String colour,
                      double x, double y, double width, double height) {
        super(name, colour, x, y); //call constructor of class above
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double centreX = getX() + width/2;
        double centreY = getY() + height/2;
        return new Point(centreX, centreY);
    }

    public boolean isSquare() {
        return (width == height);
    }

    @Override
    public String toString() {
        return "Rectangle: [width=" + width + ", height=" + height + "]";
    }
}
