package homeworks.homework6;

import java.io.FileNotFoundException;

final class ExceptionalSituationsUtils {

    public ExceptionalSituationsUtils() {

    }

    public static void getReferenceNullPointerException() {
        try {
            String name = null;
            name.charAt(0);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void getArrayIndexOutOfBoundsException() {
        try {
            int[] arrayException = {1, 2, 3, 4, 5};
            arrayException[6] = 2;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
            e.getStackTrace();
        }
    }

    public static int getSum(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("x или y меньше нуля");
        return x + y;
    }

    public static void myException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void myThreeExceptions() throws Exception {
        switch ((int) (Math.random() * ((3 - 1) + 1)) + 1) {
            case 1:
                throw new FileNotFoundException();
            case 2:
                throw new ArrayIndexOutOfBoundsException();
            case 3:
                throw new NullPointerException();
        }
    }

    public static void myExceptionFiftyFifty() throws FileNotFoundException {
        if (((int) (Math.random() * ((10 - 1) + 10)) + 10) % 2 == 0) {
            System.out.println("ok");
        } else {
            throw new FileNotFoundException();
        }
    }
}

