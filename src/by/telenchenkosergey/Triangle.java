package by.telenchenkosergey;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону A:");
        int a = input.nextInt();
        System.out.println("Введите сторону B:");
        int b = input.nextInt();
        System.out.println("Введите сторону C:");
        int c = input.nextInt();

        System.out.println(isReal(a, b, c));
    }

    public static StringBuilder isReal(int a, int b, int c) {
        StringBuilder result = new StringBuilder("Треугольник со сторонами " + a + ", " + b + ", " + c);
        if (a + b > c && b + c > a && a + c > b) {
            result.append(" существует");
        } else {
            result.append(" не существует");
        }
        return result;
    }
}
