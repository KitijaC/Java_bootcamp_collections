package setExamples;

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
}
