package by.telenchenkosergey;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        System.out.println("Введите число для анализа:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(analysis(number));
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static int digits(int num) {
        int digits = 0;
        if (num == 0) {
            return digits;
        } else {
            num = Math.abs(num);
            while (num > 0) {
                num /= 10;
                digits++;
            }
        }
        return digits;
    }

    public static StringBuilder analysis(int number) {
        int digitCounter = digits(number);
        StringBuilder result = new StringBuilder("Число " + number + " ");
        if (digitCounter == 0) {
            result.append("ноль");
            return result;
        } else if (digitCounter == 1) {
            result.append("однозначное,");
        } else if (digitCounter == 2) {
            result.append("двузначное,");
        } else {
            result.append("трехзначное или более,");
        }

        boolean positive = isPositive(number);
        if (positive) {
            result.append(" положительное");
        } else {
            result.append(" отрицательное");
        }
        return result;
    }
}
