package ab47;


	interface Zomato{
		
		void eat();
		void parcel();	
	}
	public class Assignment_65 implements Zomato{
			
		void popup(String details) {
			
			System.out.println("Thank you for choosing Zomato");
		}	
		public static void main(String[] args) {		
			Assignment_65 od= new Assignment_65();
			
			od.popup("ANKU");
			od.eat();
			od.parcel();
		}
		@Override
		public void eat() {		
			System.out.println("Dine in");
		}
		@Override
		public void parcel() {		
			System.out.println("Dine out");
		}
	}