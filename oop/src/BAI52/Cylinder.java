package BAI52;

public class Cylinder {
    private Circle base; // Base circle
    private double height;

    // Constructors
    public Cylinder() {
        this.base = new Circle(); // Default Circle (radius=1.0, color=red)
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius); // Set radius, default color
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    // Getter & Setter
    public double getRadius() { return base.getRadius(); }
    public void setRadius(double radius) { base.setRadius(radius); }

    public String getColor() { return base.getColor(); }
    public void setColor(String color) { base.setColor(color); }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}
