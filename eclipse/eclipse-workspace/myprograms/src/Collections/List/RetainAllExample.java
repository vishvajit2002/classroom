package Collections.List;
import java.util.ArrayList;
import java.util.List;

public class RetainAllExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("hello");


        // Retain only the elements in list1 that are also in list2
        list1.retainAll(list2);
        list2.retainAll(list1);


        System.out.println("List after retainAll operation: " + list1);
        System.out.println("List after retainAll operation: " + list2);
        
//        List<String> list11 = new ArrayList<>();
//        list11.add("Apple");
//        list11.add("Banana");
//        list11.add("Cherry");
//
//        List<String> list12 = new ArrayList<>();
//        list12.add("Banana");
//        list12.add("Cherry");
//
//        // Remove all elements in list1 that are also in list2
//        list11.removeAll(list12);
//
//        System.out.println("List after removeAll operation: " + list11);
//    
       }
}
