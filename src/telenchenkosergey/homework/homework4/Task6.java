package telenchenkosergey.homework.homework4;
// С консоли в массив вводим предложения. Выводим только те предложения в которых от 3 до 5 слов
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int size = 5;
        String[] lines = new String[size];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            String line = input.nextLine();
            lines[i] = line;
        }

        input.close();

        for (String line : lines) {
            String[] splittedLine = line.split(" ");
            if (splittedLine.length >=3 && splittedLine.length <= 5) {
                System.out.println(line);
            }
        }

    }
    
}
