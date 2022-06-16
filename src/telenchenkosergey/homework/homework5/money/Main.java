package telenchenkosergey.homework.homework5.money;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(123L, 10);
        Money money2 = new Money(124L, 0);

        Money sumMoney = money1.sum(money2);
        System.out.println(sumMoney);

        Money subtractMoney = money1.subtract(money2);
        System.out.println(subtractMoney);

        Money divideMoney = money1.divide(money2);
        System.out.println(divideMoney);

        System.out.println(money1.equality(money2));
    }
}