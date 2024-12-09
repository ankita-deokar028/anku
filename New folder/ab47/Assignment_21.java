package ab47;
	public class Assignment_21 {
		Assignment_21()
		{
			System.out.println("this is my constructor ");
		}
		static void add()
		{
			int a=500;
			int b=500;
			int sum = a+b;
			System.out.println("this is Static method->"+sum);
	    }
		void mul()
		{
			int a=500;
			int b=500;
			int mul = a*b;
			System.out.println("this is NON static method->"+mul);
			}
	
	   public static void main(String[] args) {
			
		   Assignment_21 s= new Assignment_21();
			//new Assignment_21();
			add();
			s.mul();
	   }
	   }
	
	
		
