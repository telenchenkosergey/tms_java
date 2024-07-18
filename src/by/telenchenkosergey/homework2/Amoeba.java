package by.telenchenkosergey.homework2;

public class Amoeba {
    public static void main(String[] args) {
        int amoebas = 1;
        for (int i = 0; i <= 24; i += 3) {
            System.out.printf("Hour: %d Amoebas: %d\n", i, amoebas);
            amoebas *= 2;
        }
    }
}
