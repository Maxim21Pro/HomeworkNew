package homeworks.homework2;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] numsArray = new int[]{1, 2, 3, 4, 5};
        for (int i = numsArray.length - 1; i > 0; --i) {
            int temp = numsArray[i - 1];
            numsArray[i - 1] = numsArray[i];
            numsArray[i] = temp;
        }
        System.out.print(Arrays.toString(numsArray));
    }
}

