package telenchenkosergey.homework.homework1;
// Задание 3
public class NumberOutput {
    public static void main(String[] args) {
        System.out.println(numberOutput(-10));
    }

    public static int numberOutput(int number) {
        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }
}
