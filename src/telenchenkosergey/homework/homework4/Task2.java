package telenchenkosergey.homework.homework4;
// Ввести с консоли строку. Заменить все большие буквы на маленькие и все пробелы символом подчеркивания

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();
        input.close();

        System.out.println(string.toLowerCase().replace(' ', '_'));
    }
}
