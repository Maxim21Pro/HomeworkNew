package homeworks.homework6;

import java.io.IOException;

public class CheckedClassExceptions extends IOException {

    public CheckedClassExceptions() {
    }

    public CheckedClassExceptions(String message) {
        super(message);
    }

    public CheckedClassExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedClassExceptions(Throwable cause) {
        super(cause);
    }

}
