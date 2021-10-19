package homeworks.homework4;

public class Rectangle {
    private Point upperLeftCorner;
    private Point lowerRightСorner;

    public Rectangle(Point upperLeftCorner, Point lowerRightСorner) {
        setUpperLeftCorner(upperLeftCorner);
        setLowerRightСorner(lowerRightСorner);
    }

    public int getRectangleArea(Point upperLeftCorner, Point lowerRightСorner) {
        return (upperLeftCorner.getOY() - lowerRightСorner.getOY()) *
                (lowerRightСorner.getOX() - upperLeftCorner.getOX());
    }

    public int getRectanglePerimeter(Point upperLeftCorner, Point lowerRightСorner) {
        return (upperLeftCorner.getOY() - lowerRightСorner.getOY()) +
                (lowerRightСorner.getOX() - upperLeftCorner.getOX()) * 2;
    }

    public double getRectangleDiagonal(Point upperLeftCorner, Point lowerRightСorner) {
        return Math.sqrt((lowerRightСorner.getOY() - upperLeftCorner.getOY()) *
                        (lowerRightСorner.getOY() - upperLeftCorner.getOY()) +
                        (lowerRightСorner.getOX() - upperLeftCorner.getOX()) *
                        (lowerRightСorner.getOX() - upperLeftCorner.getOX()));
    }

    public Point getUpperLeftCorner() {
        return upperLeftCorner;
    }

    public void setUpperLeftCorner(Point upperLeftCorner) {
        this.upperLeftCorner = upperLeftCorner;
    }

    public Point getLowerRightСorner() {
        return lowerRightСorner;
    }

    public void setLowerRightСorner(Point lowerRightСorner) {
        this.lowerRightСorner = lowerRightСorner;
    }
}
