package telenchenkosergey.homework.homework5.report;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("James Bond", 30000),
            new Employee("Peter Parker", 20000),
            new Employee("Bruce Wayne", 50000)
        };

        Report report = new Report();
        System.out.println(report.generateReport(employees)); 
    }
    
}
