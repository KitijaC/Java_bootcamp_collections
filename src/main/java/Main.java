import listsExamples.ArrayListExample;
import listsExamples.LinkedListsExample;
import queueExample.DequeueExample;
import queueExample.QueueExample;
import setExamples.SetExample;

import java.util.HashSet;

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

        System.out.println("=== Example with queue ===");
        QueueExample queueExample = new QueueExample();
        queueExample.firstExampleWithString();

        System.out.println("=== Example queue with object ===");
        queueExample.secondExampleWithObject();

        System.out.println("=== Example Dequeue with String ===");
        DequeueExample dequeueExample = new DequeueExample();
        dequeueExample.firstExampleWithString();

        System.out.println("=== Example HashSet with String ===");
        SetExample setExample = new SetExample();
        setExample.exampleHashSetWithString();

        System.out.println("=== Example HashSet with Object ===");
        setExample.exampleHashSetWithObject();

    }
}
