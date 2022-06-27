package telenchenkosergey.homework.homework6.car;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota Auris", 200, 5000);
        Car mazda = new Car("Mazda 6", 220, 6000);

        toyota.start();
        mazda.start();
    }
}
