package homeworks.homework5;

import java.util.Objects;

public final class ShapeUtils {

    private ShapeUtils() {
        throw new UnsupportedOperationException();
    }

    public static void isRectangle(Object object) {
        if (Objects.nonNull(object)) {
            if (object instanceof Rectangle) {
                System.out.println("Это прямоугольник");
            } else {
                System.out.println("Это не прямоугольник");
            }
        }
    }

    public static void isTriangle(Object object) {
        if (Objects.nonNull(object)) {
            if (object instanceof Triangle) {
                System.out.println("Это Треугольник");
            } else {
                System.out.println("Это не Треугольник");
            }
        }
    }
}

