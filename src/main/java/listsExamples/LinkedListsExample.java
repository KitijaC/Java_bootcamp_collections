package listsExamples;

import java.util.LinkedList;

public class LinkedListsExample {

    public void firstExampleWithString() {
        LinkedList<String> studentNames = new LinkedList<>();

        studentNames.add("Zino");
        studentNames.add("Agnese");
        studentNames.add("Olga");
        studentNames.add("Rasa");

        System.out.println("=== Linked List Example ===");
        System.out.println(studentNames);

        studentNames.get(3);
        studentNames.add("Rasa");
        studentNames.add(0, "some student");
        studentNames.add(4, "another student");
        studentNames.add(6, "and another student");

        System.out.println(studentNames);

    }

    public void secondExampleWithObject(){
        System.out.println("=== LinkedList with object ===");
        LinkedList<Product> products = new LinkedList<>();
        products.add(new Product("Rice", 3));
        products.add(new Product("Soap", 45));
        products.add(new Product("Something else", 64));
        products.add(new Product("another thing", 23));

        System.out.println(products);
    }
}
