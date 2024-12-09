package ab47;

import java.util.Scanner;

public class Assignment_43 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the length of side 1: ");
	        double side1  = scanner.nextDouble();

	        System.out.print("Enter the length of side 2: ");
	        double side2  = scanner.nextDouble();
	        
	        System.out.print("Enter the length of side 3: ");
	        double side3  = scanner.nextDouble();

	        double area = side1 + side2 + side3;
	        System.out.println("The circumference of the triangle is: " + area);

	        scanner.close();
	    
	}

}
