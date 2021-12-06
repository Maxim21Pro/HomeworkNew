package homeworks.homework10.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task1Utils {

    private Task1Utils() {
    }

    public static void isEmail(String email) {

        Pattern isEmail = Pattern.compile("^[a-zA-Z]\\w+@\\w+(.org|.com)$");
        Matcher matcher = isEmail.matcher(email);
        if (matcher.find()) {
            System.out.println("Это email!");
        } else {
            System.out.println("Это не email!");
        }
    }

}
