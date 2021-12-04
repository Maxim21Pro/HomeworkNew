package homeworks.homework8.task4;

import java.util.List;
import java.util.ListIterator;

public class Student {

    private String name;
    private String surName;
    private int age;
    private double averageScore;

    public Student(String name, String surName, int age, double averageScore) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public static Student getBestStudent(List<Student> listStudents) {
        Student bestStudent = listStudents.get(0);
        ListIterator<Student> iterStudent = listStudents.listIterator();
        Student student;
        while (iterStudent.hasNext()) {
            student = iterStudent.next();
            if (student.getAverageScore() > bestStudent.getAverageScore()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.averageScore, averageScore) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surName != null ? surName.equals(student.surName) : student.surName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(averageScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
