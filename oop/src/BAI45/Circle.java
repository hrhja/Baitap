package BAI45;

public class Circle extends Shape {
    private double radius;

    // No-arg constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor với bán kính
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor với đầy đủ tham số
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
