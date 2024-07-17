package by.telenchenkosergey.homework1;

import java.util.Scanner;

public class HowManyProgrammers {
    public static void main(String[] args) {
        System.out.println("Введите количество:");
        Scanner input = new Scanner(System.in);
        int programmers = input.nextInt();
        System.out.printf("%d программист%s\n", programmers, howMany(programmers, "", "а", "ов"));
    }

    public static String howMany(int count, String one, String few, String many) {
        if (count % 100 >= 11 && count % 100 <= 14) {
            return many;
        }
        if (count % 10 == 1 && count % 100 != 11) {
            return one;
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            return few;
        } else {
            return many;
        }
    }
}
