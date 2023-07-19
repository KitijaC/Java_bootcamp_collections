import listsExamples.ArrayListExample;
import listsExamples.LinkedListsExample;

public class Main {
    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        System.out.println("===== Examples with array List =====");
        arrayListExample.firstExampleStringItems();

        arrayListExample.secondExampleWithObject();

        System.out.println("===== Examples with linked List =====");
        LinkedListsExample linkedListsExample = new LinkedListsExample();
        linkedListsExample.firstExampleWithString();

        linkedListsExample.secondExampleWithObject();
    }
}
