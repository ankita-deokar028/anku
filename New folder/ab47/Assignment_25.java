package ab47;

public class Assignment_25 {
	
	Assignment_25(double a)
	{
		System.out.println("This is 1st Constructor Program");
	}
	Assignment_25(int a)
	{
		System.out.println("This is 2nd Constructor Program");
	}
	Assignment_25(int a,int b, String c)
	{
		System.out.println("This is 3rd Constructor Program");
	}

	
	static void add(int a)
	 {
		 System.out.println("this is 1st  method overloading ");
	 }
	static void add()
	 {
		 System.out.println("this is 2nd  method overloading");
	 }
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
				new Assignment_25(155.50);
				new Assignment_25(50);
				new Assignment_25(12,17,"Ankita");
				
			    add(44);
		        add();
			    }
			    
	  
}


