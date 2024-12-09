package ab47;

class gp {
	
	static void p1() {
		System.out.println("This is grantparent method");
	}
}

class C extends gp{
	
	static void p2() {
		System.out.println("This is Parent mathod");
	}
}

public class Assignment_51 extends C {

	static void p3() {
		System.out.println("This is child method");
	}
	
	public static void main(String[] args) {
		p1();
		p2();
		p3();
	}
}