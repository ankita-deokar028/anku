package ab47;
/*Assignment 143
Write a program on premitive type casting
for1:Narrowing: convert double into int 2:Widning:convert int into double"
*/
public class Assignment_143 {
    public static void main(String[] args) {
        
        double myDouble = 11.98;
        int myInt = (int) myDouble; // Explicit cast (narrowing)
        
        System.out.println("Original double value: " + myDouble);
        System.out.println("After narrowing to int: " + myInt);
        
        int myInteger = 100;
        double myNewDouble = myInteger; // Implicit cast (widening)
        
        System.out.println("Original int value: " + myInteger);
        System.out.println("After widening to double: " + myNewDouble);
    }
}

