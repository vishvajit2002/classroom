package List;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        
        // 1. Add elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("Initial LinkedList: " + linkedList);
        
        // 2. Add element at the front
        ((LinkedList<String>) linkedList).addFirst("Mango");
        System.out.println("After adding Mango at front: " + linkedList);
        
        // 3. Add element at the end
        ((LinkedList<String>) linkedList).addLast("Grapes");
        System.out.println("After adding Grapes at end: " + linkedList);
        
        // 4. Get first and last element
        System.out.println("First element: " + ((LinkedList<String>) linkedList).getFirst());
        System.out.println("Last element: " + ((LinkedList<String>) linkedList).getLast());
        
        // 5. Remove first and last elements
        ((LinkedList<String>) linkedList).removeFirst();
        System.out.println("After removing first element: " + linkedList);
        
        ((LinkedList<String>) linkedList).removeLast();
        System.out.println("After removing last element: " + linkedList);
        
        // 6. Iterating with forEach
        System.out.print("Iterating over elements: ");
        linkedList.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();
        
        // 7. Add and Remove from specific index
        linkedList.add(1, "Kiwi");
        System.out.println("After adding Kiwi at index 1: " + linkedList);
        
        linkedList.remove(1);
        System.out.println("After removing element at index 1: " + linkedList);
        
        // 8. Clear list
        linkedList.clear();
        System.out.println("After clearing LinkedList: " + linkedList);
    }
}
