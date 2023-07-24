package setExamples;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

        // Zino => fhdhh <- Hashing
        // equals, hashCode
    /* 3 main types
    * HashSet
    * TreeSet
    * LinkedHashSet
    * */


    public void exampleHashSetWithString() {
        HashSet<String> studentNames = new HashSet<>();

        if(studentNames.isEmpty()){
            System.out.println("Please add students");
        }

        // duplicate items will be ignored
        studentNames.add("Vilma");
        studentNames.add("Olga");
        studentNames.add("Nadezda");
        studentNames.add("Zino");
        studentNames.add("Olga");
        studentNames.add("Zino");
        studentNames.add("Kitija");

        if (studentNames.contains("Zino")) {
            System.out.println("Zino is found");
        }

        System.out.println(studentNames);
        for (String studentName: studentNames){
            System.out.println(studentName);
        }
    }

    public void exampleHashSetWithObject(){
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Zino", 9));
        students.add(new Student("James", 12));
        students.add(new Student("Mary", 7));
        students.add(new Student("Elina", 15));
        students.add(new Student("Sam", 19));
        students.add(new Student("Julia", 10));
        students.add(new Student("Zino", 9));
        students.add(new Student("Mary", 7));

        System.out.println(students);

        for(Student student: students) {
            System.out.println(student.getName());
            this.doSomethingMore(student);

            try {
                this.doSomethingWithException();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public void exampleLinkedHashSet(){
        Set<String> studentNames = new LinkedHashSet<>();

        studentNames.add("Karolina");
        studentNames.add("Zino");
        studentNames.add("Olga");
        studentNames.add("Zino");
        studentNames.add("Agnese");

        System.out.println(studentNames);
    }

    public void exampleTreesSet(){
        System.out.println("=== Tree Set Example ===");
        TreeSet<String> studentName = new TreeSet<>();

        studentName.add("Zino");
        studentName.add("Florina");
        studentName.add("Agnese");
        studentName.add("Zino");
        studentName.add("Ekaterina");

        System.out.println("Examples with primitive types: ");
        studentName.forEach(System.out::println);

        System.out.println("Examples with custom object (Student): ");

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("Valeria", 34));
        students.add(new Student("Zino", 60));
        students.add(new Student("Karolina", 40));
        students.add(new Student("Zino", 60));
        students.add(new Student("Olga", 90));

        students.forEach(System.out::println);

        System.out.println(students.descendingSet());

        // find similar objects in list
        System.out.println(students.contains(new Student("Zino", 45))); // false
        System.out.println(students.contains(new Student("Zino", 60))); // true

        System.out.println(students.first());
        System.out.println(students.last());

        // remove items from list
        System.out.println(students.remove(new Student("Olga", 90)));
        students.removeIf(currentStudent -> currentStudent.getName().equals("Zino"));

        System.out.println(students);
    }

    private void doSomethingWithException() throws Exception {
    }

    private void doSomethingMore(Student student) {}
}
