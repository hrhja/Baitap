package BAI63;

public class TEST {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        System.out.println("Initial Position: " + point);

        point.moveUp();
        System.out.println("After moveUp: " + point);

        point.moveDown();
        System.out.println("After moveDown: " + point);

        point.moveLeft();
        System.out.println("After moveLeft: " + point);

        point.moveRight();
        System.out.println("After moveRight: " + point);
    }
}

