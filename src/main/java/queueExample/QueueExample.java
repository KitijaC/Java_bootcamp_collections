package queueExample;

import model.Product;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    /*
    * FIFO - First in, First out
    * LIFO - Last in, First out
    * LILO - Last in, last out
    * */
    public void firstExampleWithString() {
        // linked list support implementation for queue's
        Queue<String> customers = new LinkedList<>();

        customers.offer("Zino");
        customers.offer("Ramune");
        customers.offer("Vilma");
        customers.offer("Karolina");

        System.out.println(customers);

        this.attendToCustomer(customers.peek()); // for viewing the next item, will not remove from list

        this.attendToCustomer(customers.poll()); // this will remove the customer from the queue
        this.attendToCustomer(customers.poll());
        this.attendToCustomer(customers.poll());

        System.out.println(customers); // to see all customers

        if(!customers.isEmpty()) { // check if there is still a customer
            this.attendToCustomer(customers.poll());
        }

        System.out.println("we have processed all customers: " + customers.isEmpty());
    }

    public void secondExampleWithObject(){
        Queue<Product> products = new LinkedList<>();
        products.offer(new Product("Some product", 2.50));
        products.offer(new Product("Another product", 24.40));
        products.offer(new Product("Rice", 4.50));
        products.offer(new Product("Milk", 39.48));

        System.out.println(products.poll()); // it returns null if there is no value left in queue
        System.out.println(products.remove()); // there will be exception if no item is left in the list

        Product currentProduct = products.poll();
        System.out.println("current product: " + currentProduct.getName());
        System.out.println(products.element()); // returns the item without removing but throws exception if item is not found
    }
    public void attendToCustomer(String customer) {
        // does something with customer
        System.out.println("Attending to customer: " + customer);
    }
}
