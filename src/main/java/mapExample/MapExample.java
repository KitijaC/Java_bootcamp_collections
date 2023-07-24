package mapExample;

import model.Product;
import model.Student;

import java.util.*;

public class MapExample {

    // linkedHashMap
    // treeMap
    // hashMap

    // key : value

    public void firstExampleHashMap() {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Zino", 45);
        studentScores.put("Ramune", 35);
        studentScores.put("Ilga", 60);
        studentScores.put("Olga", 70);
        studentScores.put("Agnese", 23);

        studentScores.put("Zino", 62);

        System.out.println(studentScores);
        System.out.println(studentScores.get("Olga"));
    }

    public void secondExampleHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        // add
        studentScores.put("Zino", 45);
        studentScores.put("Baiba", 78);

        //find
        System.out.println(studentScores.get("Zino"));

        // delete
        studentScores.remove("Zino");

        // update
        studentScores.put("Baiba", 89);

        System.out.println(studentScores);
    }

    public void thirdExampleHashMap(){
        Map<UUID, Student> students = new HashMap<>();

        Student student1 = new Student("Zino", 59);
        Student student2 = new Student("Laura", 78);
        Student student3 = new Student("Agnese", 99);
        Student student4 = new Student("Olga", 23);

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);
        students.put(student4.getId(), student4);

        System.out.println(students);

        System.out.println(students.keySet()); // gives us the list of keys (list of UUID)
        System.out.println(students.values()); // gives you all the values as collection i.e list
        List<Student> studentList = (List<Student>) students.values(); // convert map to list

//        System.out.println(students.entrySet());

    }

    public void firstExampleTreeMap(){
        System.out.println("=== Example Tree Map ===");
        Map<Integer, String> studentNames = new TreeMap<>();

        studentNames.put(3, "Karolina");
        studentNames.put(1, "Zino");
        studentNames.put(5, "Ilga");
        studentNames.put(7, "Laura");
        studentNames.put(7, "Laura");
        studentNames.put(2, "Agnese");

        System.out.println(studentNames);

        studentNames.forEach((key, value) -> {
            // do something about the key and values
            // do something about the key and values
            // do something about the key and values
            // do something about the key and values
        });

        studentNames.forEach((key, value) -> System.out.println("Student no " + key + " student name " + value));

        for (Map.Entry<Integer, String> entry : studentNames.entrySet()) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Student no " + k + " student name " + v);
        }
        studentNames.forEach(MapExample::handleStudent);
    }

    public void firstExampleLinkedHashMap(){
        Map<UUID, Product> listOfProducts = new LinkedHashMap<>();

        listOfProducts.put(UUID.randomUUID(), new Product("Rice", 30.45));
        listOfProducts.put(UUID.randomUUID(), new Product("Milk", 60.40));
        listOfProducts.put(UUID.randomUUID(), new Product("Bread", 70.45));
        listOfProducts.put(UUID.randomUUID(), new Product("Chicken", 20.30));
        listOfProducts.put(UUID.randomUUID(), new Product("Food", 10.40));

        UUID idToUseForDuplicate = UUID.randomUUID();
        listOfProducts.put(idToUseForDuplicate, new Product("Food", 10.40));
        listOfProducts.put(idToUseForDuplicate, new Product("Something else", 10.40));

        for (Map.Entry<UUID, Product> currentProduct : listOfProducts.entrySet()) {
            UUID productKey = currentProduct.getKey();
            Product product = currentProduct.getValue();

            System.out.println("Product ID: " + productKey + "Product: " + product);
        }

//        for (UUID id: listOfProducts.keySet()) {
//            // do something with keys
//        }
//        for (Product product: listOfProducts.values()) {
//            // do something with values
//        }
    }

    private static void handleStudent(Integer key, String value) {
        System.out.println("Student no " + key + " student name " + value);
    }
}
