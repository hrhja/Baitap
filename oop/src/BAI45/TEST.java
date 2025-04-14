package BAI45;

public class TEST {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);

       
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Circle circle2 = new Circle(2.5, "blue", true);
        System.out.println(circle2);
        System.out.println("Circle Area: " + circle2.getArea());
        System.out.println("Circle Perimeter: " + circle2.getPerimeter());

    
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Rectangle rectangle2 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println(rectangle2);
        System.out.println("Rectangle Area: " + rectangle2.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle2.getPerimeter());


        Square square = new Square(3.0);
        System.out.println(square);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Square square2 = new Square(4.0, "purple", false);
        System.out.println(square2);
        System.out.println("Square Area: " + square2.getArea());
        System.out.println("Square Perimeter: " + square2.getPerimeter());
    }
}

