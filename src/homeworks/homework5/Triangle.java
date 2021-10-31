package homeworks.homework5;

public class Triangle extends Point {

    private float leftSideOfTriangle;
    private float rightSideOfTriangle;
    private float baseOfTriangle;
    private float heightOfTriangle;

    public Triangle(float x, float y, float leftSideOfTriangle, float rightSideOfTriangle, float baseOfTriangle, float heightOfTriangle) {
        super(x, y);
        this.leftSideOfTriangle = leftSideOfTriangle;
        this.rightSideOfTriangle = rightSideOfTriangle;
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    @Override
    public float getArea() {
        return getBaseOfTriangle() * getHeightOfTriangle() * 0.5F;
    }

    @Override
    public float getPerimeter() {
        return getLeftSideOfTriangle() + getRightSideOfTriangle() + getBaseOfTriangle();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "leftSideOfTriangle=" + leftSideOfTriangle +
                ", rightSideOfTriangle=" + rightSideOfTriangle +
                ", baseOfTriangle=" + baseOfTriangle +
                ", heightOfTriangle=" + heightOfTriangle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Float.compare(triangle.leftSideOfTriangle, leftSideOfTriangle) != 0) return false;
        if (Float.compare(triangle.rightSideOfTriangle, rightSideOfTriangle) != 0) return false;
        if (Float.compare(triangle.baseOfTriangle, baseOfTriangle) != 0) return false;
        return Float.compare(triangle.heightOfTriangle, heightOfTriangle) == 0;
    }

    @Override
    public int hashCode() {
        int result = (leftSideOfTriangle != +0.0f ? Float.floatToIntBits(leftSideOfTriangle) : 0);
        result = 31 * result + (rightSideOfTriangle != +0.0f ? Float.floatToIntBits(rightSideOfTriangle) : 0);
        result = 31 * result + (baseOfTriangle != +0.0f ? Float.floatToIntBits(baseOfTriangle) : 0);
        result = 31 * result + (heightOfTriangle != +0.0f ? Float.floatToIntBits(heightOfTriangle) : 0);
        return result;
    }

    public float getLeftSideOfTriangle() {
        return leftSideOfTriangle;
    }

    public void setLeftSideOfTriangle(float leftSideOfTriangle) {
        this.leftSideOfTriangle = leftSideOfTriangle;
    }

    public float getRightSideOfTriangle() {
        return rightSideOfTriangle;
    }

    public void setRightSideOfTriangle(float rightSideOfTriangle) {
        this.rightSideOfTriangle = rightSideOfTriangle;
    }

    public float getBaseOfTriangle() {
        return baseOfTriangle;
    }

    public void setBaseOfTriangle(float baseOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
    }

    public float getHeightOfTriangle() {
        return heightOfTriangle;
    }

    public void setHeightOfTriangle(float heightOfTriangle) {
        this.heightOfTriangle = heightOfTriangle;
    }
}
