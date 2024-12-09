package ab47;

public class Assignment_141 {
	//Assignment 141:Write a program where u have 1SIB,2IIB,1Main method 
	//Create 2 object Check order of execution"
		static {
			System.out.println("SIB1");
		}
		{
			System.out.println("IIB1");
		}
		{
		System.out.println("IIB2");
		}
		public static void main(String[] args) {
			System.out.println("main method");
			new Assignment_141();
			new Assignment_141();
			
		
	
}
}
