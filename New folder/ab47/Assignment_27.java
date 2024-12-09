package ab47;

public class Assignment_27 {
    int a = 10;  // Value of 'a'
    int b = 5;   // Value of 'b'
  
    public void addition() {
        System.out.println("Addition of a and b: " + (a + b));
    }
    public void subtraction() {
        System.out.println("Subtraction of a and b: " + (a - b));
    }
    public void multiplication() {
        System.out.println("Multiplication of a and b: " + (a * b));
    }
    public void division() {
            System.out.println("Division of a by b: " + (a / b));
    }
    public void modulus()
    {
            System.out.println("Modulus of a and b: " + (a % b));      
    }
    public static void main(String[] args) {
    	Assignment_27 obj = new Assignment_27();
        obj.addition();        // Addition
        obj.subtraction();     // Subtraction
        obj.multiplication();  // Multiplication
        obj.division();        // Division
        obj.modulus();         // Modulus
    }
}