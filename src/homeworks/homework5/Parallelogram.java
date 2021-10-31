package homeworks.homework5;

public class Parallelogram extends Point {

    private float leftSideOfParallelogram;
    private float undersideOfParallelogram;
    private float parallelogramHeight;

    public Parallelogram(float x, float y, float leftSideOfParallelogram, float undersideOfParallelogram, float parallelogramHeight) {
        super(x, y);
        this.leftSideOfParallelogram = leftSideOfParallelogram;
        this.undersideOfParallelogram = undersideOfParallelogram;
        this.parallelogramHeight = parallelogramHeight;
    }

    @Override
    public float getArea() {
        return getUndersideOfParallelogram() * getParallelogramHeight();
    }

    @Override
    public float getPerimeter() {
        return 2 * (getLeftSideOfParallelogram() + getUndersideOfParallelogram());
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "leftSideOfParallelogram=" + leftSideOfParallelogram +
                ", undersideOfParallelogram=" + undersideOfParallelogram +
                ", parallelogramHeight=" + parallelogramHeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parallelogram that = (Parallelogram) o;

        if (Float.compare(that.leftSideOfParallelogram, leftSideOfParallelogram) != 0) return false;
        if (Float.compare(that.undersideOfParallelogram, undersideOfParallelogram) != 0) return false;
        return Float.compare(that.parallelogramHeight, parallelogramHeight) == 0;
    }

    @Override
    public int hashCode() {
        int result = (leftSideOfParallelogram != +0.0f ? Float.floatToIntBits(leftSideOfParallelogram) : 0);
        result = 31 * result + (undersideOfParallelogram != +0.0f ? Float.floatToIntBits(undersideOfParallelogram) : 0);
        result = 31 * result + (parallelogramHeight != +0.0f ? Float.floatToIntBits(parallelogramHeight) : 0);
        return result;
    }

    public float getLeftSideOfParallelogram() {
        return leftSideOfParallelogram;
    }

    public void setLeftSideOfParallelogram(float leftSideOfParallelogram) {
        this.leftSideOfParallelogram = leftSideOfParallelogram;
    }

    public float getUndersideOfParallelogram() {
        return undersideOfParallelogram;
    }

    public void setUndersideOfParallelogram(float undersideOfParallelogram) {
        this.undersideOfParallelogram = undersideOfParallelogram;
    }

    public float getParallelogramHeight() {
        return parallelogramHeight;
    }

    public void setParallelogramHeight(float parallelogramHeight) {
        this.parallelogramHeight = parallelogramHeight;
    }
}
