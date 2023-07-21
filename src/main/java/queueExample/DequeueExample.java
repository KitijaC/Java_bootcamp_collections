package queueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

// Double Ended Queue
public class DequeueExample {

    public void firstExampleWithString(){
        Deque<String> cars = new ArrayDeque<>();

        cars.offer("Toyota");
        cars.offer("Mazda");
        cars.addFirst("Volvo");
        cars.offer("Audi");
        cars.addFirst("Ferrari");
        cars.addLast("BMW");
        cars.addFirst("Porsche");
        cars.offer("Nissan");

        /*
        * Porsche
        * Ferrari
        * Volvo
        * Toyota
        * Mazda
        * Audi
        * BMW
        * Nissan
        * */

        cars.pollFirst(); // will remove items from top of list
        cars.pollLast(); // will remove items from bottom of list

        // these just return the first and last  items - doesn't remove
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.poll();
        cars.pollFirst();
        cars.pollLast();

        if(cars.isEmpty()){}// check if items remain
        if(cars.poll() == null){} // check if item is not returned
        System.out.println(cars);

        try {
            // these will throw exceptions if there are no items left to view or remove
            cars.removeFirst();
            cars.removeLast();
            cars.remove();
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
