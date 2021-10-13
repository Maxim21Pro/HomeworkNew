package homeworks.homework2;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] numsArray1 = {1, 2, 3, 4, 5};
        int[] numsArray2 = {5, 6, 7, 8};
        int[] numsArray3 = new int[numsArray1.length + numsArray2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < numsArray3.length; i += 2) {
            if (j < numsArray1.length) {
                if (k < numsArray2.length) {
                    numsArray3[i] = numsArray1[j];
                    numsArray3[i + 1] = numsArray2[k];
                    ++j;
                    ++k;
                } else {
                    while (j < numsArray1.length) {
                        numsArray3[i] = numsArray1[j];
                        ++i;
                        ++j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(numsArray3));
    }
}
