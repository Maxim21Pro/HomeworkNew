package homeworks.homework10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task2Utils {

    private Task2Utils() {
    }

    public static void getHexadecimalNumbers(String text) {
        Pattern pattern = Pattern.compile("(0x|0X)[0-9A-Fa-f]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Число: " + matcher.group());
        }
    }
}
