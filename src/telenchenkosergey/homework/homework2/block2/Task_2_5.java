package telenchenkosergey.homework.homework2.block2;

public class Task_2_5 {
    public static void main(String[] args) {
        final double cmToInch = 2.54;

        for (int inch = 1; inch <= 20; inch++) {
            System.out.printf("%d\" = %.2f cm\n", inch, cmToInch*inch);
        }
    }
}
