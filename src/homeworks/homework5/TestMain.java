package homeworks.homework5;

import static homeworks.homework5.ShapeUtils.isRectangle;
import static homeworks.homework5.ShapeUtils.isTriangle;

public class TestMain {

    public static void main(String[] args) {

        Rectangle test = new Rectangle(2,2,5,5);
        Triangle test1 = new Triangle(2,2,3,4,5,6);
        isRectangle(test);
        isTriangle(test1);
        isRectangle(test1);
        isTriangle(test);


    }
}
