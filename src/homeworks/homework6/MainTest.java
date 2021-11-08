package homeworks.homework6;

import java.io.FileNotFoundException;

import static homeworks.homework6.ExceptionalSituationsUtils.*;

public class MainTest {

    public static void main(String[] args) throws CheckedClassExceptions, Exception {

        System.out.println(getSum(6, 4));

        try {
            myException();
        } catch (FileNotFoundException e) {
            throw new CheckedClassExceptions("Файл не найден");
        }

        try {
            myThreeExceptions();
        } catch (FileNotFoundException e1) {
            System.out.println("Исключение 1");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Исключение 2");
        } catch (NullPointerException e3) {
            System.out.println("Исключение 3");
        }

        try {
            myExceptionFiftyFifty();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка");
        } finally {
            System.out.println("Ок");
        }
    }
}
