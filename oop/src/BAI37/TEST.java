package BAI37;

import java.util.Random;

public class TEST {
public static void main(String[] args) {
        Ball ball = new Ball(50, 50);

        Player teamA[] = { new Player("Alice", 10, 20), new Player("Bob", 20, 30) };
        Player teamB[] = { new Player("Charlie", 80, 20), new Player("David", 90, 30) };

        Random rand = new Random();
        for (int i = 0; i < 5; i++) { // 5 lượt đá
            Player p = rand.nextBoolean() ? teamA[rand.nextInt(teamA.length)] : teamB[rand.nextInt(teamB.length)];
            System.out.println(p + " kicks the ball!");

            float xPower = rand.nextFloat() * 10 - 5; // Ngẫu nhiên từ -5 đến 5
            float yPower = rand.nextFloat() * 10 - 5;
            p.kick(ball, xPower, yPower);

            ball.move();
            System.out.println(ball);
        }
    }
}











