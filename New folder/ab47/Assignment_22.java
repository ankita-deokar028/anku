package ab47;

public class Assignment_22 {

	Assignment_22(double a)
	{
		System.out.println("This is 1st Constructor Program");
	}
	Assignment_22(int a)
	{
		System.out.println("This is 2nd Constructor Program");
	}
	Assignment_22(int a,int b, String c)
	{
		System.out.println("This is 3rd Constructor Program");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment_22(155.50);
		new Assignment_22(50);
		new Assignment_22(12,17,"Ankita");

	}

}