package BAI51;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Thử đặt lại giá trị của p1 thành (100, 10)
        p1.setXY(100, 10);
        System.out.println("After update: " + p1);
    }
}
