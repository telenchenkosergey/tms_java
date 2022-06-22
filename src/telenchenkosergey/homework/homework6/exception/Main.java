package telenchenkosergey.homework.homework6.exception;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Car toyota = new Car("Toyota Auris", 160, 5000);
        Car mazda = new Car("Mazda 6", 150, 6000);

        toyota.start();
        mazda.start();
    }
}
