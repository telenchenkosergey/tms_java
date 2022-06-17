package telenchenkosergey.homework.homework5.fraction;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 5);
        Fraction b = new Fraction(7, 4);

        Fraction sum = a.sumFraction(b);
        Fraction dif = a.subFraction(b);
        Fraction mult = a.multFraction(b);
        Fraction div = a.divFraction(b);
        Fraction eq = a.sumFraction(b);

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(sum.equals(eq));
        System.out.println(sum.equals(dif));
    }
}
