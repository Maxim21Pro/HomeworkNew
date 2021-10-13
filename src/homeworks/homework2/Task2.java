package homeworks.homework2;

public class Task2 {

    public static void main(String[] args) {

        int[] numsArray = {2, 3, 2, 4, 5, 7, 5, 6};

        int a;
        int i;
        for (a = 0; a < numsArray.length; ++a) {
            for (i = 1; i < numsArray.length - 1; ++i) {
                if (numsArray[i - 1] > numsArray[i]) {
                    int temp = numsArray[i];
                    numsArray[i] = numsArray[i - 1];
                    numsArray[i - 1] = temp;
                }
            }
        }
        a = 0;
        for (i = 1; i < numsArray.length; ++i) {
            if (numsArray[a] != numsArray[i]) {
                ++a;
                numsArray[a] = numsArray[i];
            }
        }
        for (i = 0; i <= a; ++i) {
            System.out.print(" " + numsArray[i]);
        }
    }
}
