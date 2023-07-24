import listsExamples.ArrayListExample;
import listsExamples.LinkedListsExample;
import mapExample.MapExample;
import queueExample.DequeueExample;
import queueExample.QueueExample;
import setExamples.SetExample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

        System.out.println("=== Example LinkedHashSet with String ===");
        setExample.exampleLinkedHashSet();

        System.out.println("=== Example TreeSet ===");
        setExample.exampleTreesSet();

        System.out.println("=== Example HashMap ===");
        MapExample mapExample = new MapExample();
        mapExample.firstExampleHashMap();

        System.out.println("=== Second example HashMap ===");
        mapExample.secondExampleHashMap();
    }
}
