package by.telenchenkosergey.homework2;

public class Calc {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256;) {
            sum += i;
            i *= 2;
        }
        System.out.println(sum);
    }
}
