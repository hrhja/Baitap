package BAI36;

public class TEST {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 10, 5, 45);
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);

        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
    }
}

