package ab47;

import java.util.Scanner;

public class Assignment_44 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the circle:  ");
    double radius = scanner.nextDouble();

    double area = Math.PI * radius * radius;

    System.out.println("The area of the circle  is: " + area);

    scanner.close();
}
}
