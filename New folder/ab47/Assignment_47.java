package ab47;

import java.util.Scanner;

public class Assignment_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Press 1 to Launch Chorme browser ");
		 System.out.println("Press 2 to Launch Mozilla browser ");
		 System.out.println("Press 3 to Launch Edge browser ");
		 System.out.println("Press 4 to Launch Safari browser ");
		 
		 System.out.println("Enter the number for launching the browser: ");
	        int i = scanner.nextInt();

			switch (i) {
	        case 1:
	            System.out.println("Chrome Browser Launch ");
	            break;
	        case 2:
	            System.out.println("Mozilla Browser Launch");
	            break;
	        case 3:
	            System.out.println("Edge Browser Launch");
	            break;
	        case 4:
	            System.out.println("Safari Browser Launch");
	            break;
	        default:
	            System.out.println("your selection is wrong, kindly press 1, 2, 3and 4 only ");
	           
	    }


	}

}
