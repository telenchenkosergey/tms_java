package telenchenkosergey.homework.homework2.block2;

public class Task_2_1 {
    public static void main(String[] args) {
        double distancePerDay = 10;
        double totalDistance = 0;

        for (int day = 1; day <= 7; day++) {
            totalDistance += distancePerDay;
            distancePerDay += distancePerDay * 0.1;
        }
        System.out.printf("The runner totally run %.2f km", totalDistance);
    }
}
