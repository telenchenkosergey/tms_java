package telenchenkosergey.homework.homework5.money;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(1L, 10);
        Money money2 = new Money(124L, 0);

        Money sumMoney = money1.sum(money2);
        System.out.println("The total amount of money is " + sumMoney + " RUB");

        Money subtractMoney = money1.subtract(money2);
        System.out.println("The difference between the first and the second amounts is " + subtractMoney + " RUB");

        int divider = 4;
        Money divideMoney = money1.sumDivide(money2, divider);
        System.out.println("Total amount of money divided by " + divider + " is " + divideMoney + " RUB");

        Fraction fraction = new Fraction(5, 3);
        Money multipliedByFraction = money1.multiplyByFraction(fraction);
        System.out.println(money1 + " RUB" + " multiplied by " + fraction + " is " + multipliedByFraction + " RUB");

        System.out.println(money1.equality(money2));
    }
}