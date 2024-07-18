package by.telenchenkosergey.homework2;

public class ConverterInToCm {
    public static void main(String[] args) {
        double cmInInch = 2.54;
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d in = %.2f cm\n", i, i * cmInInch);
        }
    }
}
