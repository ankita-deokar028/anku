package ab47;

	interface one{	
		void login();	
	}	
	interface two{
		void logout();	
	}
	public class Assignment_67 implements one,two {	
		void Forgot() {		
			System.out.println("This is Child class");
		}

		public static void main(String[] args) {
			Assignment_67 aa= new Assignment_67();	
			aa.login();
			aa.logout();
			aa.Forgot();		
		}
		@Override
		public void logout() {	
			System.out.println("This is interface 2");		
		}
		@Override
		public void login() {
			System.out.println("This is interface 1");
			
		}

	}

