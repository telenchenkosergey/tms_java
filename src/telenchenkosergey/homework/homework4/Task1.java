package telenchenkosergey.homework.homework4;

// Считайте с клавиатуры три строки. А затем:
// 1. Выведите на экран третью строку в неизменном виде
// 2. Выведите на экран вторую строку, предварительно преобразовав ее к верхнему регистру
// 3. Выведите на экран первую стркоу, предварительно преобразовав ее к нижнему регистру
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = 3;
        String[] strings = new String[size];

        for (int i = 0; i < size; i++) {
            String s = input.nextLine();
            strings[i] = s;
        }

        input.close();

        System.out.println(strings[2]);
        System.out.println(strings[1].toUpperCase());
        System.out.println(strings[0].toLowerCase());
    }
}
