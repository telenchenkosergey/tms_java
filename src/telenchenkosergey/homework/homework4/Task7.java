package telenchenkosergey.homework.homework4;
// Ввести n строк с консоли. Вывести на консоль только те строки, длина которых больше средней, а также длину. Использовать StringBuilder.
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int size = 5;
        String[] lines = new String[size];
        Scanner input = new Scanner(System.in);
        int overallLength = 0;
        StringBuilder longerStrings = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String line = input.nextLine();
            lines[i] = line;
            overallLength += line.length();
        }

        int midLength = overallLength / size;

        input.close();

        for (String line : lines) {
            if (line.length() > midLength) {
                longerStrings.append(line + "\n");
                longerStrings.append("The line's length: " + line.length() + "\n");
            }
        }

        System.out.println(longerStrings);

    }
    
}
