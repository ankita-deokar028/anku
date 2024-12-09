package ab47;

	interface uber{
		void tripcnf(String cnf);
		void tripcode(int code);	
	}
	abstract class passangerdetails implements uber{
		abstract void passagngername(String name);	
	}
	public class Assignment_66 extends passangerdetails {	
		@Override
		public void tripcnf(String cnf) {	
			System.out.println("Trip Status is :  "+ cnf );		
		}
		@Override
		public void tripcode(int code) {	
			System.out.println("Your code is : "+ code );		
		}
		@Override
		void passagngername(String name) {
			System.out.println("Your name : "+ name);	
		}
		void droppoint(String location) {
		
			System.out.println("Your drop location : "+location );	
		}
		public static void main(String[] args) {
		
			Assignment_66 nn= new Assignment_66();		
			nn.tripcnf("cnf");
			nn.tripcode(7689);
			nn.passagngername("Ankita");
			nn.droppoint("Dadar Mumbai");	
		}		
		}


