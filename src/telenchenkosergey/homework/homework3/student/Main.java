package telenchenkosergey.homework.homework3.student;

public class Main {
    public static void main(String[] args) {
        int[] myProgress = {1, 2, 3, 4, 5};
        Student student1 = new Student();
        student1.setName("Sergey Telenchenko");
        student1.setGroup("AN09-onl");
        student1.setProgress(myProgress);
        System.out.println(student1.showInfo());
        student1.changeGrade(2, 5);
        System.out.println(student1.showInfo());

        Student student2 = new Student("James Bond", "007", new int[]{5, 4, 3, 2, 1});
        Student student3 = new Student("Peter Parker", "12345", new int[]{5, 5, 5, 5, 5});

        System.out.println(student2.showInfo());
        student3.changeGrade(0, 3);
        System.out.println(student3.showInfo());
        
    }
    
}
