package setExamples;

import model.Student;

import java.util.HashSet;

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

    private void doSomethingWithException() throws Exception {
    }

    private void doSomethingMore(Student student) {}
}
