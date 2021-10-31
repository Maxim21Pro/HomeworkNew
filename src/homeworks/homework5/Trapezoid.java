package homeworks.homework5;

public class Trapezoid extends Point {

    private float lowerBaseOfTrapezoid;
    private float upperBaseOfTrapezoid;
    private float trapezoidHeight;

    public Trapezoid(float x, float y, float lowerBaseOfTrapezoid, float upperBaseOfTrapezoid, float trapezoidHeight) {
        super(x, y);
        this.lowerBaseOfTrapezoid = lowerBaseOfTrapezoid;
        this.upperBaseOfTrapezoid = upperBaseOfTrapezoid;
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public float getArea() {
        return (getLowerBaseOfTrapezoid() +
                getUpperBaseOfTrapezoid()) / 2 *
                getTrapezoidHeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trapezoid trapezoid = (Trapezoid) o;

        if (Float.compare(trapezoid.lowerBaseOfTrapezoid, lowerBaseOfTrapezoid) != 0) return false;
        if (Float.compare(trapezoid.upperBaseOfTrapezoid, upperBaseOfTrapezoid) != 0) return false;
        return Float.compare(trapezoid.trapezoidHeight, trapezoidHeight) == 0;
    }

    @Override
    public int hashCode() {
        int result = (lowerBaseOfTrapezoid != +0.0f ? Float.floatToIntBits(lowerBaseOfTrapezoid) : 0);
        result = 31 * result + (upperBaseOfTrapezoid != +0.0f ? Float.floatToIntBits(upperBaseOfTrapezoid) : 0);
        result = 31 * result + (trapezoidHeight != +0.0f ? Float.floatToIntBits(trapezoidHeight) : 0);
        return result;
    }

    public float getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(float trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    public float getLowerBaseOfTrapezoid() {
        return lowerBaseOfTrapezoid;
    }

    public void setLowerBaseOfTrapezoid(float lowerBaseOfTrapezoid) {
        this.lowerBaseOfTrapezoid = lowerBaseOfTrapezoid;
    }

    public float getUpperBaseOfTrapezoid() {
        return upperBaseOfTrapezoid;
    }

    public void setUpperBaseOfTrapezoid(float upperBaseOfTrapezoid) {
        this.upperBaseOfTrapezoid = upperBaseOfTrapezoid;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "lowerBaseOfTrapezoid=" + lowerBaseOfTrapezoid +
                ", upperBaseOfTrapezoid=" + upperBaseOfTrapezoid +
                ", trapezoidHeight=" + trapezoidHeight +
                '}';
    }
}
