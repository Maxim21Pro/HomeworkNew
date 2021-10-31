package homeworks.homework5;

public abstract class Point implements FigureI {

    float x;
    float y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }
}
