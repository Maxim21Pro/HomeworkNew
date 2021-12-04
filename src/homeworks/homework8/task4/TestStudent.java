package homeworks.homework8.task4;


import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Roman", "Hilman", 31, 8.2));
        students.add(new Student("Alexandr", "Petrov", 25, 4.9));
        students.add(new Student("Irina", "Verenich", 18, 6.0));
        students.add(new Student("Mihail", "Bondarchuk", 35, 9.2));
        students.add(new Student("Elena", "Kaminskaya", 29, 5.8));
        Students.sorted(students);
        System.out.println(Student.getBestStudent(students));
    }
}
