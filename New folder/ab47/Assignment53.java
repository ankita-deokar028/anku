package ab47;


	/*"Assignment 53
	Write a program for constructor inheritance 
	using the super calling statement with Implicit Invocation" implicit means already present
*/
	class Google3 {
		Google3() {
			System.out.println("Google constructor");
		}
	}

	public class Assignment53 extends Google3 {
		Assignment53() {

			// super(); // explicit
			System.out.println("constructor 1");
		}

		public static void main(String[] args) {
			new Assignment53();

		}

	}
