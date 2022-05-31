package telenchenkosergey.homework.homework2.block2;

public class Task_2_2 {
    public static void main(String[] args) {
        int amoebaTotalCount = 1;

        for (int time = 3; time <= 24; time += 3) {
            amoebaTotalCount *= 2;
            System.out.printf("The count of amoebas after %d hours is %d\n", time, amoebaTotalCount);
        }
    }
}
