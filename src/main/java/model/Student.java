package model;

import java.util.Objects;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", grade=" + grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        // casting = converting one object or type into another
        Student student = (Student) obj;
        boolean result = Objects.equals(name, student.getName()) && Objects.equals(this.grade, student.getGrade());

        return result;
    }

    public int hashCode() {return Objects.hash(name, grade);} // if only one item - hashCode(name)
}
