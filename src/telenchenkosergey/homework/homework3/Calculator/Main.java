package telenchenkosergey.homework.homework3.calculator;

public class Main {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Google", "Pixel 5a 5G", new Calculator());

        System.out.printf("%s %s\n", myPhone.getManufacturer(), myPhone.getModel());
        
        System.out.println(myPhone.getCalc().addition(3, 5));
        System.out.println(myPhone.getCalc().subtraction(3, 5));
        System.out.println(myPhone.getCalc().multiplication(3, 5));
        System.out.println(myPhone.getCalc().division(3, 5));
        System.out.println(myPhone.getCalc().power(3, 5));
        System.out.println(myPhone.getCalc().isEven(3));
    }
}
