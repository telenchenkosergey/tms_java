package telenchenkosergey.homework.homework2.block1;

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        input.close();

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
