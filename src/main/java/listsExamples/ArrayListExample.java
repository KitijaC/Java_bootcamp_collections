package listsExamples;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public void firstExampleStringItems(){

        // all kinds of LIst subclasses implement the List interface
        // the collections class provide more methods for manipulating lists
        List<String> products = new ArrayList<>();

        // add items at the bottom of the list
        // items are ordered based on when added
        // can contain duplicates
        products.add("Rice"); // 0 - position
        products.add("Bread"); // 1
        products.add("Soap"); // 2
        products.add("Milk"); // ..
        products.add("Rice");
        products.add("Milk");
        products.add("Rice");
        products.add("Bread");

        System.out.println(products);

        for (String currentItem : products) {
            System.out.println(currentItem);
            // do some more
        }
    }

    public void secondExampleWithObject(){
        System.out.println("=== Example ArrayList with Object ===");
        List<Product> products = new ArrayList<>();

        products.add(new Product("Rice", 55.25));
        products.add(new Product("Milk", 1.20));
        products.add(new Product("Bread", 40.03));
        products.add(new Product("Book", 75.00));
        products.add(new Product("Phone", 885.51));
        products.add(new Product("Rice", 55.25));

        for(Product currentProduct : products){
            System.out.println(currentProduct.getName() + " - " + currentProduct.getPrice());
        }

        /* also with forEach */
        //products.forEach(currentProduct -> System.out.println(currentProduct));
        products.forEach(currentProduct -> {
            // do some stuff with them here
            System.out.println(currentProduct);
        });

        //System.out.println("=== with lambda extra ===");
        /* in the case where you need to send the data from the loop to a third party class or
        * method, you can use this lambda shorthand method */
        //products.forEach(System.out::println);

        // collections class provides a lot of methods for manipulating list easily
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                // where the first item is bigger you return -1 or 1 if you are sorting from low to high or high to low
                // in the case they are equal then return 0
                // longer version
                /*
                if (product1.getPrice() > product2.getPrice()) return -1;
                if (product1.getPrice() < product2.getPrice()) return 1;
                if (product1.getPrice() == product2.getPrice()) return 0;
                return 0;
                */

                // shorter version using ternary operator
                if (product1.getPrice() == product2.getPrice()) return 0;
                return product1.getPrice() > product2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("=== with lambda and sort ===");
        /* in the case where you need to send the data from the loop to a third party class or
         * method, you can use this lambda shorthand method */
        products.forEach(System.out::println);

        System.out.println("=== in reverse order ===");
        Collections.reverse(products);
        products.forEach(currentProduct -> System.out.println(currentProduct));
    }

    public void someMethod() {
        // do stuff
    }

    public String returnValue() {
        // do stuff
        return "";
    }

    public int returnsWithCondition(){
        String user = "Zino";
        if (user == "john") return 1;
        if (user == "james") return 2;
        return 3;
    }
}
