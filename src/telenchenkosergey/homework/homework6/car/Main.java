package telenchenkosergey.homework.homework6.car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota Auris", 200, 5000),
                new Car("Mazda 6", 220, 6000)
        };
        for (Car car : cars) {
            try {
                car.start();
            } catch (StartException e) {
                throw new StartException(car.getName() + " couldn't start.");
            }
        }
    }
}
