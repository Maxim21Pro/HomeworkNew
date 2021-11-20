package homeworks.homework7;

import java.io.File;
import java.io.IOException;

import static homeworks.homework7.Task2Utils.fileSorted;
import static homeworks.homework7.Task2Utils.fileWriteNumbers;

public class Task2 {

    public static void main(String[] args) throws IOException {

        File file = new File("resources/homework7", "task2.txt");
        fileWriteNumbers(file);
        fileSorted(file);
    }
}
