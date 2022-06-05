package telenchenkosergey.homework.homework3.student;

import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private int[] progress = new int[5];

    public Student(String name, String group, int[] progress) {
        this.name = name;
        this.group = group;
        this.progress = progress;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public String showInfo() {
        return String.format("%s\t%s\n%s\n", getName(), getGroup(), Arrays.toString(getProgress()));
    }

    public void changeGrade(int index, int grade) {
        getProgress()[index] = grade;
    }
    
}
