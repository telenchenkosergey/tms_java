package telenchenkosergey.homework.homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int size = 5;
        String[] words = new String[size];
        StringBuilder palindrome = new StringBuilder();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            words[i] = input.nextLine();
        }

        input.close();

        for (String word : words) {
            if (isPalindrome(word)) {
                palindrome.append(word + ", ");
            }
        }
        palindrome.delete(palindrome.length() - 2, palindrome.length() - 1);
        System.out.println(palindrome.toString());

    }

    public static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
