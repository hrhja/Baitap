package BAI37;

public class Ball {
    private float x, y;
    private float xDelta, yDelta;

    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
        this.xDelta = 0;
        this.yDelta = 0;
    }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public void setDirection(float xDelta, float yDelta) {
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void stop() {
        xDelta = 0;
        yDelta = 0;
    }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ")";
    }
}

