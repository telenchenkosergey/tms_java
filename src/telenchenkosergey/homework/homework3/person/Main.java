package telenchenkosergey.homework.homework3.person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("James Bond", 42);

        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
    }
    
}
