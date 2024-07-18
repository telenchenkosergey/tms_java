package by.telenchenkosergey.homework2;

public class Triangles {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";

        for (int i = 1; i < 5; i++) {
            System.out.println(star.repeat(i));
        }

        System.out.println();

        for (int i = 4; i > 0; i--) {
            System.out.println(star.repeat(i));
        }

        System.out.println();

        for (int i = 1, j = 3; i <= 4; i++, j--) {
            System.out.print(space.repeat(j));
            System.out.println(star.repeat(i));
        }

        System.out.println();

        for (int i = 4, j = 0; i > 0; i--, j++) {
            System.out.print(space.repeat(j));
            System.out.println(star.repeat(i));
        }
    }
}
