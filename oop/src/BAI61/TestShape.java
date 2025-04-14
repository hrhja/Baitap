package BAI61;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());

        Shape s2 = new Rectangle(2.0, 4.0, "blue", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

        Shape s3 = new Square(3.0, "green", false);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());
        System.out.println("Perimeter: " + s3.getPerimeter());
    }
}

