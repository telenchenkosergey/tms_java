package by.telenchenkosergey.homework2;

public class Runner {
    public static void main(String[] args) {
        double distance = 10;
        int day = 1;
        double sum = 0;

        while (day <= 7) {
            System.out.printf("Дистанция за %d день: %.2f км\n", day, distance);
            sum += distance;
            distance *= 1.1;
            day++;
        }
        System.out.printf("Всего пробежал за 7 дней: %.2f км\n", sum);
    }
}
