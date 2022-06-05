package telenchenkosergey.homework.homework3.calculator;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double power(int num, int power) {
        return Math.pow(num, power);
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
