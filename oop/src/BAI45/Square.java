package BAI45;

public class Square extends Rectangle {
    // Constructor với một tham số cạnh
    public Square(double side) {
        super(side, side);
    }

    // Constructor với đầy đủ tham số
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter và Setter cho cạnh (dùng chung width và length)
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Ghi đè setter cho width và length để đảm bảo hình vuông
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
