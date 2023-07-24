package model;

import java.util.Objects;
import java.util.UUID;

public class Student implements Comparable {

    private UUID id;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.grade = grade;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
        return "name=" + name +
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

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.grade > student.getGrade()) return 1;
        if (this.grade < student.getGrade()) return -1;
        return 0;
    }

    public int hashCode() {return Objects.hash(name, grade);} // if only one item - hashCode(name)
}
