package homeworks.homework6;

public class UncheckedClassException extends RuntimeException {

    public UncheckedClassException() {
    }

    public UncheckedClassException(String message) {
        super(message);
    }

    public UncheckedClassException(String message, Throwable cause) {
        super(message, cause);
    }
}
