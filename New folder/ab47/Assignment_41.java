package ab47;

import java.util.Scanner;

public class Assignment_41 {
public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the Width of the rectangle: ");
        double Width = scanner.nextDouble();

        double area = length * Width ;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }

}





