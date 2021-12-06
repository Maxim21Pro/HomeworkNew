package homeworks.homework9.task1;


import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> numbers = Arrays.asList(5, 2, 4, 2, 1);
        numbers.forEach(stringBuilder::append);
        System.out.println(stringBuilder.toString());
        System.out.println(numbers);
    }
}
