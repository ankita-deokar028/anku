package ab47;

public class Assignment_137 {
	//"Assignment 137:Write a program with exception handlling using one catch block "
		public static void main(String[] args) {
			try {
				int d = 1 / 0; // value 1 has come from parent class a/b
								// and 0 has come from grand parent class
				System.out.println(d);

			}

			catch (ArithmeticException ad) {
				
				System.out.println("Exception occurs: there is a problem but you can proceed " + ad.getMessage());
			}
		
}
}
