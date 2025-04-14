package BAI27;

public class TEST {
    public static void main(String[] args) {
        MyLine line = new MyLine(3, 4, 6, 8);
        System.out.println(line);
        System.out.printf("Length: %.2f\n", line.getLength());
        System.out.printf("Gradient (radians): %.2f\n", line.getGradient());
    }
}


