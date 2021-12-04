package homeworks.homework8.task1;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public final class Task1Utils {

    private Task1Utils() {
    }

    public static Collection getCollectionFromText(File file) {
        List<List<String>> myWordsLists = new ArrayList<>();
        List<String> myWordsListsNew = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))) {
            while ((line = bufferedReader.readLine()) != null) {
                myWordsLists.add(Arrays.asList(line.split(" ")));
            }
            for (int i = 0; i < myWordsLists.size(); i++) {
                for (int j = 0; j < myWordsLists.get(i).size(); j++) {
                    String word = myWordsLists.get(i).get(j);
                    myWordsListsNew.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myWordsListsNew;
    }

    public static void getRepeatedWordsInTheText(File fileTxt) {
        Set<String> set = new HashSet<String>(getCollectionFromText(fileTxt));
        for (String r : set) {
            System.out.println(r + ": " + Collections.frequency(getCollectionFromText(fileTxt), r));
        }
    }
}
