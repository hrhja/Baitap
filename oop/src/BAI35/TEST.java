package BAI35;

public class TEST {
    public static void main(String[] args) {
        System.out.println("=== Test nextDay() ===");
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);
        System.out.println(d1.nextDay());
        System.out.println(d1.nextDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());

        System.out.println("\n=== Test previousDay() ===");
        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());

        System.out.println("\n=== Test previousYear() ===");

        System.out.println("\n=== Test vòng lặp từ 28 Dec 2011 đến 2 Mar 2012 ===");
        MyDate d4 = new MyDate(2011, 12, 28);
        for (int i = 0; i < 65; i++) {
            System.out.println(d4);
            d4.nextDay();
        }
    }
}
