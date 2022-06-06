package telenchenkosergey.homework.classwork;

public class Phone {
    private final String manufacturer;
    private final String model;

    public Phone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    protected static String call(String number) {
        return "Calling " + number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // public void setManufacturer(String manufacturer) {
    // this.manufacturer = manufacturer;
    // }

    public String getModel() {
        return model;
    }

    // public void setModel(String model) {
    // this.model = model;
    // }

}
