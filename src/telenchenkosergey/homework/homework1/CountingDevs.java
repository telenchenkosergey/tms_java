package telenchenkosergey.homework.homework1;
// Задание 7
public class CountingDevs {
    public static void main(String[] args) {
        System.out.println(countingDevs(101));
    }


    public static String countingDevs(int count) {
        return count + " программист" +
                rightSuffix(count, "", "а", "ов");
    }

    public static String rightSuffix(int count, String forOne, String forSeveral, String forMany) {
        if (count % 10 == 1 && count != 11) {
            return forOne;
        } else if (count % 100 >= 2 && count % 100 <= 4) {
            return forSeveral;
        } else {
            return forMany;
        }
    }
}
