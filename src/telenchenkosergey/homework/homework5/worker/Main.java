package telenchenkosergey.homework.homework5.worker;

public class Main {
    public static void main(String[] args) {
        Worker engineer = new Worker("Vasya", "Pupkin");

        engineer.setDays(24);
        engineer.setRate(12.5);

        System.out.println(engineer.getSalary());
        System.out.println(engineer.getDays());

        engineer.addDay();

        System.out.println(engineer.getDays());

        engineer.addDay(5);

        System.out.println(engineer.getDays());

        engineer.paySalary();

        System.out.println(engineer.getDays());

        System.out.println(engineer.getSalary());

    }
}
