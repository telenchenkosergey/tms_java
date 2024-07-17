package by.telenchenkosergey;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int arraySize = 3;
        int[] numbers = new int[arraySize];
        fillAnArray(numbers, arraySize);
        analyzeAnArray(numbers);
    }

    public static void fillAnArray(int[] numbers, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите число " + (i + 1) + ":");
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
        System.out.println("Количество положительных: " + positive);
        System.out.println("Количество отрицательных: " + negative);
    }
}
