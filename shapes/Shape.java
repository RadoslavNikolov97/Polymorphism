package shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}
