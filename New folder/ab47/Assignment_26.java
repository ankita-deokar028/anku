package ab47;

public class Assignment_26 {
	int c= 10;
	static double d =20.9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		a=101;//local variable update the value 
		int b= 90;
		System.out.println(a+b);
		d=10;// global variable update the value 
		System.out.println(d);
		Assignment_26 g1=new Assignment_26 ();
		g1.c=100;
		System.out.println(g1.c);
	}

}
