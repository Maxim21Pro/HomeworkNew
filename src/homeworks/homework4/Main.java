package homeworks.homework4;

public class Main {

    public static void main(String[] args) {

        Point tochka1 = new Point(2, 9);
        Point tochka2 = new Point(4, 4);
        Rectangle rectangleTest = new Rectangle(tochka1, tochka2);
        System.out.println("Площадь прямоугольника = " + rectangleTest.getRectangleArea(tochka1, tochka2));
        System.out.println("Диогональ прямоугольника = " + rectangleTest.getRectangleDiagonal(tochka1, tochka2));
        System.out.println("Периметр прямоугольника = " + rectangleTest.getRectanglePerimeter(tochka1, tochka2));
        System.out.println("Дистанция от точки до точки = " + Point.getDistance(tochka1, tochka2));
    }
}
