package BAI64;

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Sử dụng composition

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Center=" + center.toString() + ", radius=" + radius;
    }
}

