package BAI45;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // No-arg constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor với tham số chiều rộng và chiều dài
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor với đầy đủ tham số
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Tính diện tích
    public double getArea() {
        return width * length;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
