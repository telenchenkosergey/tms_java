package telenchenkosergey.homework.homework6.car;

public class Car {
    private final String name;
    public int speed;
    public int price;

    public Car(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws StartException {
        int start = (int)(Math.random() * 20);
        System.out.println(start);
        if (start % 2 == 0) {
            throw new StartException();
        }

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
