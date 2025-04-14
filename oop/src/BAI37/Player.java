package BAI37;

public class Player {
    private String name;
    private float x, y;

    public Player(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    public void kick(Ball ball, float xPower, float yPower) {
        ball.setDirection(xPower, yPower);
    }

    @Override
    public String toString() {
        return "Player " + name + " at (" + x + ", " + y + ")";
    }
}

