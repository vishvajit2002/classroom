package List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        
        // 1. Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Initial Vector: " + vector);
        
        // 2. Add at specific index
        vector.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + vector);
        
        // 3. Remove by index and element
        vector.remove(1);
        vector.remove("Banana");
        System.out.println("After removing Mango and Banana: " + vector);
        
        // 4. Check capacity and size
        System.out.println("Size of Vector: " + vector.size());
        System.out.println("Capacity of Vector: " + vector.capacity());
        
        // 5. Iterating using iterator
        System.out.print("Iterating over Vector: ");
        vector.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();
        
        // 6. Clear vector
        vector.clear();
        System.out.println("After clearing Vector: " + vector);
    }
}
