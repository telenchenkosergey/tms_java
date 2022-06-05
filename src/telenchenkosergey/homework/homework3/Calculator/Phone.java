package telenchenkosergey.homework.homework3.calculator;

public class Phone {
    String manufacturer;
    String model;
    Calculator calc;

    public Phone(String manufacturer, String model, Calculator calc) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.calc = calc;
    }

    protected static String call(String number) {
        return "Calling " + number;
    }

    public Calculator getCalc() {
        return calc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
