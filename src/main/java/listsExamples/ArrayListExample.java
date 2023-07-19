package listsExamples;

import java.util.ArrayList;
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
    }
}
