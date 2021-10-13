package homeworks.homework2;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6, 7}};
        System.out.println(Arrays.toString(linearize(array)));
    }

    public static int[] linearize(int[][] twoDimensionalArray) {
        int[] oneDimensionalArray = new int[twoDimensionalArray[0].length + twoDimensionalArray[1].length];
        int k = 0;
        for (int i = 0; i < twoDimensionalArray.length; ++i) {
            for (int j = 0; j < twoDimensionalArray[i].length; ++j) {
                oneDimensionalArray[k++] = twoDimensionalArray[i][j];
            }
        }
        return oneDimensionalArray;
    }
}
