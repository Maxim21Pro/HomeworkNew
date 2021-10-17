package homeworks.homework3;

public class Task1 {

    public static void main(String[] args) {

        String word = "ТОПОТ";
        System.out.println(palindrome(word));
    }

    public static boolean palindrome(String inPalindrome) {
        int i = inPalindrome.length() - 1;
        int j = 0;
        while (i > j) {
            if (inPalindrome.charAt(i) != inPalindrome.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
