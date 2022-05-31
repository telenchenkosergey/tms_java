package telenchenkosergey.homework.homework2.block2;

import java.util.Scanner;

public class Task_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Enter multiplicator: ");
        int multiplicator = input.nextInt();
        input.close();
        int sum = 0;

        for (int i = 0; i < multiplicator; i++) {
            sum += num;
        }
        System.out.println(sum);
    }
}
