package homeworks.homework8.task3;

import java.util.ArrayList;
import java.util.List;

public class TestTask3 {

    public static void main(String[] args) {

        List<String> myListWords = new ArrayList<>();
        myListWords.add("this");
        myListWords.add("is");
        myListWords.add("lots");
        myListWords.add("of");
        myListWords.add("fun");
        myListWords.add("for");
        myListWords.add("every");
        myListWords.add("Java");
        myListWords.add("programmer");

        Task3.markLength4(myListWords);
        System.out.println(myListWords);


    }
}
