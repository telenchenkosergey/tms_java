package telenchenkosergey.homework.homework5.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sumFraction(Fraction fraction) {
        int resultNumerator = this.getNumerator() * fraction.getDenominator() + this.getDenominator() * fraction.getNumerator();
        int resultDenominator = this.getDenominator() * fraction.getDenominator();
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction subFraction(Fraction fraction) {
        int resultNumerator = this.getNumerator() * fraction.getDenominator() - this.getDenominator() * fraction.getNumerator();
        int resultDenominator = this.getDenominator() * fraction.getDenominator();
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction multFraction(Fraction fraction) {
        int resultNumerator = this.getNumerator() * fraction.getNumerator();
        int resultDenominator = this.getDenominator() * fraction.getDenominator();
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction divFraction(Fraction fraction) {
        int resultNumerator = this.getNumerator() * fraction.getDenominator();
        int resultDenominator = this.getDenominator() * fraction.getNumerator();
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getNumerator());
        builder.append("/");
        builder.append(this.getDenominator());
        String result = builder.toString();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fraction other = (Fraction) obj;
        if (denominator != other.denominator)
            return false;
        if (numerator != other.numerator)
            return false;
        return true;
    }
}
