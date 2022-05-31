package telenchenkosergey.homework.homework2.block2;

public class Task_2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 256;

        while (i <= max) {
            sum += i;
            i *= 2;
        }
        System.out.println(sum);
    }
}
