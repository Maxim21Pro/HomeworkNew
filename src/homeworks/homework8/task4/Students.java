package homeworks.homework8.task4;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public final class Students {

    private Students() {
    }

    public static void sorted(List list) {
        if (Objects.nonNull(list)) {
            Comparator<Student> studentComp = new StudentNameComparator()
                    .thenComparing(new StudentSurNameComparator())
                    .thenComparing(new StudentAgeComparator())
                    .thenComparing(new StudentAverageScoreComparator());
            TreeSet<Student> students = new TreeSet<>(studentComp);
            students.addAll(list);
            System.out.println(students);
        } else System.out.println("");
    }
}
