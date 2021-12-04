package homeworks.homework8.task3;


import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public final class Task3 {

    public static final String ADDED_ELEMENT = "****";

    private Task3() {
    }

    public static void markLength4(List list) {

        if (Objects.nonNull(list)) {
            ListIterator<String> iter = list.listIterator();
            while (iter.hasNext()) {
                String word = iter.next();
                if (word.length() == 4) {
                    iter.add(ADDED_ELEMENT);
                }
            }
        }
    }
}

