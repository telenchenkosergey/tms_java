package telenchenkosergey.homework.homework1;
//Задание 5
public class HowManyPositiveAndNegative {
    public static void main(String[] args) {
        System.out.println(howManyPositiveAndNegative(1, -6, 0, -232, 987, 0, 36));
    }

    public static String howManyPositiveAndNegative(int ... n) {
        int positive = 0;
        int negative = 0;

        for (int i : n) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            }
        }
        return "Количество положительных чисел: " + positive + "\nКоличество отрицательных чисел: " + negative;
    }
}
