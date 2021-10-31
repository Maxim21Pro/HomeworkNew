package homeworks.homework5;

public class Circle extends Point {

    private float circleRadius;

    public Circle(float x, float y, float circleRadius) {
        super(x, y);
        this.circleRadius = circleRadius;
    }

    public float circleDiameter() {
        return getCircleRadius() * 2;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * getCircleRadius() * getCircleRadius();
    }

    @Override
    public float getPerimeter() {
        return (float) Math.PI * circleDiameter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Float.compare(circle.circleRadius, circleRadius) == 0;
    }

    @Override
    public int hashCode() {
        return (circleRadius != +0.0f ? Float.floatToIntBits(circleRadius) : 0);
    }

    public float getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(float circleRadius) {
        this.circleRadius = circleRadius;
    }
}
