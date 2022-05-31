package telenchenkosergey.homework.homework1;
//Задание 5
public class HowManyPositive {
    public static void main(String[] args) {
        System.out.println(howManyPositive(1, -6, 0));
    }

    public static String howManyPositive(int ... n) {
        int positive = 0;

        for (int i : n) {
            if (i > 0) {
                positive++;
            }
        }
        return "Количество положительных чисел: " + positive;
    }
}
