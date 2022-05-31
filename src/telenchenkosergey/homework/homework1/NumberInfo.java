package telenchenkosergey.homework.homework1;
//Задание 1
public class NumberInfo {
    public static void main(String[] args) {
        System.out.println(numberInfo(532));
    }

    public static String numberInfo(int number) {
        if (number == 0) {
            return "Число равно нулю";
        } else {
            String stringNumber = Integer.toString(Math.abs(number));
            String[] arrayString = stringNumber.split("");
            return "Число " + number + " " + positiveOrNegative(number) + " " + arrayString.length + "-значное";
        }
    }
    // Определяем является ли число положительным или отрицательным
    public static String positiveOrNegative(int number) {
        if (number > 0) {
            return "положительное";
        }
        return "отрицательное";
    }
}
