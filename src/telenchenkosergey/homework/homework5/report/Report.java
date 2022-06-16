package telenchenkosergey.homework.homework5.report;

public class Report {

    public String generateReport(Employee[] employees) {
        StringBuilder result = new StringBuilder();
        long minSalary = defineMinSalary(employees);
        long midSalary = defineMidSalary(employees);
        long maxSalary = defineMaxSalary(employees);

        result.append("Minimal Salary:\t" + minSalary + "\n");
        result.append("Mid Salary:\t" + midSalary + "\n");
        result.append("Max Salary:\t" + maxSalary + "\n");

        return result.toString();
    }

    public static long defineMinSalary(Employee[] employees) {
        long minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static long defineMaxSalary(Employee[] employees) {
        long maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static long defineMidSalary(Employee[] employees) {
        long sum = 0;
        long midSalary;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        midSalary = sum / employees.length;
        return midSalary;
    }
}
