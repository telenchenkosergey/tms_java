package by.telenchenkosergey.homework1;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        fillAnArray(numbers);
        analyzeAnArray(numbers);
    }

    public static void fillAnArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Введите число %d:\n", i + 1);
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
    }

    public static void analyzeAnArray(int[] numbers) {
        int positive = 0;
        int negative = 0;
        for (int number : numbers) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        System.out.printf("Количество положительных: %d\n", positive);
        System.out.printf("Количество отрицательных: %d\n", negative);
    }
}
