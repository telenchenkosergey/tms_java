package telenchenkosergey.homework.homework5.money;

// Класс Деньги для работы с денежными суммами. 
// Число должно быть представлено двумя полями: типа long для рублей и типа int - для копеек.
// Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
// Реализовать сложение, вычитание, деление сумм, умножение на дробное число и операции сравнения.
// В функции main проверить эти методы.

public class Money {
    private long rouble;
    private int coin;

    public Money(long rouble, int coin) {
        this.rouble = rouble;
        this.coin = coin;
    }

    public long getTotalAmount(long rouble, int coin) {
        return (long) coin + rouble * 100;
    }

    // Addition
    public Money sum(Money money) {
        long result = this.getTotalAmount(getRouble(), getCoin())
                + money.getTotalAmount(money.getRouble(), money.getCoin());

        long resultRouble = result / 100;
        int resultCoin = (int) result % 100;
        return new Money(resultRouble, resultCoin);
    }

    // Subtraction
    public Money subtract(Money money) {
        long result = this.getTotalAmount(getRouble(), getCoin())
                - money.getTotalAmount(money.getRouble(), money.getCoin());

        long resultRouble = result / 100;
        int resultCoin = Math.abs((int) result % 100);
        return new Money(resultRouble, resultCoin);
    }

    // Sum Division
    public Money sumDivide(Money money, int divider) {
        long result = (this.getTotalAmount(getRouble(), getCoin())
                + money.getTotalAmount(money.getRouble(), money.getCoin())) / divider;
        long resultRouble = result / 100;
        int resultCoin = (int) result % 100;
        return new Money(resultRouble, resultCoin);
    }

    // Multiply By Fraction
    public Money multiplyByFraction(Fraction fraction) {
        long result = this.getTotalAmount(getRouble(), getCoin()) * fraction.getNumerator() / fraction.getDenominator();
        long resultRouble = result / 100;
        int resultCoin = (int) result % 100;
        return new Money(resultRouble, resultCoin);
    }

    // Equality
    public String equality(Money money) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.toString());
        if (this.getTotalAmount(getRouble(), getCoin()) > money.getTotalAmount(money.getRouble(),
                money.getCoin())) {
            builder.append(" is greater than ");
        } else if (this.getTotalAmount(getRouble(), getCoin()) < money.getTotalAmount(money.getRouble(),
                money.getCoin())) {
            builder.append(" is smaller than ");
        } else {
            builder.append(" is equal to ");
        }
        builder.append(money.toString());
        return builder.toString();
    }

    public long getRouble() {
        return rouble;
    }

    public int getCoin() {
        return coin;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getRouble());
        builder.append(",");

        if (getCoin() < 10) {
            builder.append("0");
        }

        builder.append(this.getCoin());
        String result = builder.toString();
        return result;
    }

}
