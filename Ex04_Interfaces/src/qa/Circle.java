package qa;

public class Circle extends Shape implements Movable {
    private double radius;

    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }

    @Override
    public String toString() {
        return
                "Circle [Radius=" + radius +
                        ", Area=" + getArea() +
                        ", CentrePoint=" + getCentrePoint() +
                        ", X=" + getX() +
                        ", Y=" + getY() +
                        ", Name=" + getName() +
                        ", Colour=" + getColour() +
                        "]";
    }

    @Override
    public Point getCurrentLocation() {
        return getCentrePoint();
    }

    @Override
    public void move(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);
    }
}
