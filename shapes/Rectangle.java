package shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Cannot be zero or negative");
        }
        this.height = height;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Cannot be zero or negative");
        }
        this.width = width;
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        return width * height;
    }

    @Override
    public double calculateArea() {
        return (width * 2) + (2 * height);
    }
}
