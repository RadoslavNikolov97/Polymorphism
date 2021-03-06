package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    private void setRadius(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Cannot be zero or negative");
        }
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
