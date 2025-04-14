package BAI28;

public class TEST {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 2, 3);
        MyCircle c2 = new MyCircle(new MyPoint(5, 6), 4);
        
        System.out.println(c1);
        System.out.println(c2);
        
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());
        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}

