package homeworks.homework4;

public class Point {

    private int oX;
    private int oY;

    public Point(int oX, int oY) {
        setOX(oX);
        setOY(oY);
    }

    public static double getDistance(Point point1, Point point2) {
        return Math.sqrt((point2.getOX() - point1.getOX()) *
                        (point2.getOX() - point1.getOX()) +
                        (point2.getOY() - point1.getOY()) *
                        (point2.getOY() - point1.getOY()));
    }

    public int getOX() {
        return this.oX;
    }

    public void setOX(int oX) {
        this.oX = oX;
    }

    public int getOY() {
        return this.oY;
    }

    public void setOY(int oY) {
        this.oY = oY;
    }
}
