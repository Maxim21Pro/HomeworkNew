package homeworks.homework5;

public class Square extends Point {

    private float side;

    public Square(float x, float y, float side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public float getArea() {
        return getSide() * getSide();
    }

    @Override
    public float getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Float.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return (side != +0.0f ? Float.floatToIntBits(side) : 0);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", side=" + side +
                '}';
    }
}
