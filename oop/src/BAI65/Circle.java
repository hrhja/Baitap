package BAI65;

public class Circle implements GeometricObject {
    protected double radius; // Trường protected cho phép lớp con truy cập

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

