package BAI26;

public class MyPoint {
    private int x;
    private int y;

    // Constructor mặc định (tọa độ 0,0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter cho x
    public int getX() {
        return x;
    }

    // Getter cho y
    public int getY() {
        return y;
    }

    // Setter cho x
    public void setX(int x) {
        this.x = x;
    }

    // Setter cho y
    public void setY(int y) {
        this.y = y;
    }

    // Setter cho cả x và y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter trả về mảng chứa x và y
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Phương thức tính khoảng cách đến một điểm khác (truyền vào tọa độ x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Phương thức tính khoảng cách đến một đối tượng MyPoint khác
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Phương thức tính khoảng cách đến gốc tọa độ (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

