//Assignment 114
//Write a program on sort method in collection class for integer values .

package ab47;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_class {
    public static void main(String[] args) {
    
        List<Integer> integerList = new ArrayList<>();

        integerList.add(42);
        integerList.add(17);
        integerList.add(98);
        integerList.add(5);
        integerList.add(66);
        integerList.add(27);

        System.out.println("Original List: " + integerList);
        Collections.sort(integerList);

        System.out.println("Sorted List: " + integerList);
    }
}
