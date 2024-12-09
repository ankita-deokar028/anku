package ab47;
//Assignment 88 to Assignment 93
public class Assignment_88 {

	public static void main(String[] args) {

		String name="axe";
		
		System.out.println(name.matches("..."));
		
		System.out.println(name.matches("a(.*)"));
		
		System.out.println(name.matches("(.*)e"));
		
		String name2="manishtiwari";
		System.out.println(name2.matches("(.)u(.)"));
		System.out.println(name2.repeat(5));
		System.out.println(name2.lastIndexOf('i'));
	}

}
