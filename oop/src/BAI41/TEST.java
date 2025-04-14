package BAI41;

public class TEST {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "blue");
        System.out.println(circle);
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, 5.0, "green");
        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());
    }
}

