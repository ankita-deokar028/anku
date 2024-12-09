package ab47;
//"Assignment 138 Write a program with exception handlling using multiple catch block 
//"Assignment 139 Write a program with exception handlling using multiple catch block and finally block "
public class Assignment_138 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        try {
           /* System.out.println("Enter an integer:");
            int number = scanner.nextInt(); // This might throw InputMismatchException

           System.out.println("Enter a divisor:");
          int divisor = scanner.nextInt(); // This might throw InputMismatchException
*/
            int number= 10;
			int divisor=0;
			
            int result = number / divisor; // This might throw ArithmeticException
            System.out.println("The result is: " + result);
        } 
        
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
        
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
        finally {
            // This block will always execute
            System.out.println("Program execution completed.");
          //  scanner.close();
           
        }
        }
    }

