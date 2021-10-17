package homeworks.homework3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Введите римское число: ");
        Scanner romanIn = new Scanner(System.in);
        String roman = romanIn.next();
        int i = 0;
        int current = 0;
        int previous = 0;
        int arabic = 0;
        while (i < roman.length()) {
            char letter = roman.charAt(i);
            switch (letter) {
                case ('I'):
                    current = 1;
                    break;
                case ('V'):
                    current = 5;
                    break;
                case ('X'):
                    current = 10;
                    break;
                case ('L'):
                    current = 50;
                    break;
                case ('C'):
                    current = 100;
                    break;
                case ('D'):
                    current = 500;
                    break;
                case ('M'):
                    current = 1000;
                    break;
            }
            if (current > previous) {
                arabic += current - (previous * 2);
            } else {
                arabic += current;
            }
            previous = current;
            i += 1;
        }
        System.out.println("Арабское число: " + arabic);
    }
}

