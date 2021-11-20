package homeworks.homework7;

import java.io.*;
import java.util.Arrays;

public final class Task2Utils {

    private Task2Utils() {
    }

    public static void fileSorted(File file) throws IOException {
        try (DataInputStream fileSortedIn = new DataInputStream(new FileInputStream(file));
             DataOutputStream fileSortedOut = new DataOutputStream(new FileOutputStream("resources/homework7/task2result.txt"))) {
            byte[] array = fileSortedIn.readAllBytes();
            Arrays.sort(array);
            fileSortedOut.write(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWriteNumbers(File file) throws IOException {
        try (FileWriter fileWrite = new FileWriter(file)) {
            fileWrite.write("128687263865932486");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
