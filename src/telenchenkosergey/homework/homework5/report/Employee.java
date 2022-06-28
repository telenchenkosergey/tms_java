package telenchenkosergey.homework.homework5.report;

public class Employee {
    private String fullName;
    private long salary;

    public Employee(String fullName, long salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
    public String getFullName() {
        return fullName;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    
}
