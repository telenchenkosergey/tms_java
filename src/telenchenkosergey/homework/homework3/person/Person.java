package telenchenkosergey.homework.homework3.person;

public class Person {
    String fullName;
    int age;
    
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        fullName = "User";
        age = 18;
    }

    public void talk() {
        System.out.printf("%s is talking\n", this.fullName);
    }

    public void move() {
        System.out.printf("%s is moving\n", this.fullName);
    }
    
}
