package homeworks.homework8.task4;

import java.util.Comparator;

public class StudentSurNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurName().compareTo(o2.getSurName());
    }
}
