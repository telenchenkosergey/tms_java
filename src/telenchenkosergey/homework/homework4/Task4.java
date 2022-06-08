package telenchenkosergey.homework.homework4;

// Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0
public class Task4 {
    public static void main(String[] args) {
        String str = "Who is on duty today?";

        System.out.println(charChanger(3, 0, str));

    }

    public static String charChanger(int initChar, int finalChar, String initString) {
        char init = initString.charAt(initChar);
        char replacement = initString.charAt(finalChar);
        String result = initString.replace(init, replacement);
        return result;
    }
}
