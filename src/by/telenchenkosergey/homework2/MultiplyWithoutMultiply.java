package by.telenchenkosergey.homework2;

import java.util.Scanner;

public class MultiplyWithoutMultiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = input.nextInt();
        System.out.println("Enter B:");
        int b = input.nextInt();

        int sum = 0;

        while (b > 0) {
            sum += a;
            b--;
        }
        System.out.println(sum);
    }
}
