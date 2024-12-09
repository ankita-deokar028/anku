	package ab47;

import java.util.Scanner;

public class Assignment_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
   Scanner s1= new Scanner(System.in);
   
     System.out.println("Enter the value of num1");
     double num1= s1.nextDouble();
     System.out.println("Enter the value of num2");
     double num2= s1.nextDouble();
         
     double addition= num1+num2;
     double subtraction =num1-num2;
     double Multiplication= num1 *num2;
     double  Division=num1 /num2;
     double  modulus= num1%num2;
    
    
     System.out.println("Addition  of 2 number -> "+ addition);
     System.out.println("Subtraction  of 2 number -> "+ subtraction);
     System.out.println("Multiplication  of 2 number -> "+ Multiplication);
     System.out.println("Division  of 2 number -> "+ Division);
     System.out.println("Modulus  of 2 number -> "+ modulus);
     
    
     
	}

}
