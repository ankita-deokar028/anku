package ab47;
import java.util.Scanner;
public class Assignment_76 {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        int[] numbers = new int[4];

	        System.out.println("Enter 4 integer values:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        
	        scanner.close();

	
	        }
	    }
	
