package homeworks.homework7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public static final char LETTERS[] = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
            'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

    public static void main(String[] args) throws IOException {

        try (FileWriter fileWrite = new FileWriter("resources/homework7/task1result.txt")) {
            String result = Files.readString(Path.of("resources/homework7/task1.txt"));
            for (char ch = 'а'; ch <= 'я'; ch++) {
                LETTERS[ch - 'а'] = ch;
            }
            int count = 0;
            char letter;
            for (int i = 0; i < LETTERS.length - 1; i++) {
                for (int j = 0; j < result.length(); j++) {
                    letter = result.toLowerCase().charAt(j);
                    if (letter == LETTERS[i]) {
                        count++;
                    }
                }
                fileWrite.write(LETTERS[i] + " - " + count + "\n");
                count = 0;
            }        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
