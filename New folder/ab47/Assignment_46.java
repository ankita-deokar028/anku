package ab47;

import java.util.Scanner;

public class Assignment_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the side length of the square:  ");
	        double side  = scanner.nextDouble();

	        double area = 4  * side ;

	        System.out.println("The circumference  of the square is:: " + area);

	        scanner.close();
	    
		}
	}


