package BAI65;

public class TEST {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Original Circle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\n--- Testing ResizableCircle ---");
        ResizableCircle resizableCircle = new ResizableCircle(10);
        System.out.println("Before resize: " + resizableCircle);
        
        resizableCircle.resize(50);
        System.out.println("After resize (50%): " + resizableCircle);
        System.out.println("Area after resize: " + resizableCircle.getArea());
        System.out.println("Perimeter after resize: " + resizableCircle.getPerimeter());
    }
}

