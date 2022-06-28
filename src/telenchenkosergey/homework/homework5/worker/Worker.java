package telenchenkosergey.homework.homework5.worker;

public class Worker {
    private final String name;
    private final String surname;
    private double rate;
    private int days;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public double getSalary() {
        return this.getRate() * this.getDays();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRate() {
        return rate;
    }

    public int getDays() {
        return days;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void addDay() {
        this.days++;
    }

    public void addDay(int add) {
        this.days += add;
    }

    public double paySalary() {
        double salary = getSalary();
        setDays(0);
        return salary;
    }

}
