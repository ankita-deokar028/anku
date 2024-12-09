package ab47;

public class Assignment57 {
	//"Assignment 57
	//Write a Program on This Calling Statement"
	Assignment57(int k) {
			this();
			System.out.println("constructor1");
		}

	Assignment57() {

			System.out.println("calling constructor using this statemnt");

		}

	Assignment57(String s1) {
			this(10);
			System.out.println("constructor 2");
		}

		public static void main(String[] args) {
			new Assignment57("Annu");

		}

	}
