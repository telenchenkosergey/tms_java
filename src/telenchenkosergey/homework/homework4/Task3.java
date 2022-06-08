package telenchenkosergey.homework.homework4;

// Вырезать подстроку из cтроки с первого вхождения символа А до последнего вхождения символа В 
public class Task3 {
    public static void main(String[] args) {
        String initialString = "London is the capital of Great Britain";
        String a = "o";
        String b = "i";

        int firstCharIndex = initialString.indexOf(a);
        int lastCharIndex = initialString.lastIndexOf(b);

        String finalString = initialString.substring(firstCharIndex, lastCharIndex);
        System.out.println(finalString);

    }
}
