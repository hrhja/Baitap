package BAI34;

public class TEST {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current time: " + time);
        
        time.nextSecond();
        System.out.println("After nextSecond: " + time);
        
        time.previousSecond();
        System.out.println("After previousSecond: " + time);
        
        time.setTime(12, 30, 45);
        System.out.println("Updated time: " + time);
    }
}


