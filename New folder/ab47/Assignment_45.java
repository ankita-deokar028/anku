package ab47;

import java.util.Scanner;

public class Assignment_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the Width of the rectangle: ");
	        double Width = scanner.nextDouble();

	        double area = 2 * (length + Width);
	        
	        System.out.println("The circumference of the rectangle is: " + area);

	        scanner.close();
	    }

	


	}

