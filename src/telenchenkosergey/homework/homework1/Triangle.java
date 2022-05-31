package telenchenkosergey.homework.homework1;
//    Задание 2
public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(5, 4, 1));
    }


    public static String triangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Такого треугольника не существует";
        }
        return "Треугольник со сторонами " + a + ", " + b + ", " + c + " " + isRealTriangle(a, b, c);
    }

    public static String isRealTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return "существует";
        }
        return "не существует";
    }

}
