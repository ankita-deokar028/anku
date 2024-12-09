package ab47;

	abstract class ClassParent{
		
		abstract void login();
		abstract void Signup();
		
		static void postlogin() {	
			System.out.println("You have logged in sucessfully");
		}	
		void logout() {		
			System.out.println("Please visit again");
		}	
	}
	public class Assignment_64 extends ClassParent {
		
		@Override
		 void login() {	
			System.out.println("Please enter user name and Password");		
		}	
		@Override	
		void Signup() {		
			System.out.println("Please sign up");
		}	
		public static void main(String[] args) {
				
			Assignment_64 pp= new Assignment_64();
			
			pp.login();
			pp.Signup();
			postlogin();
			pp.logout();		
		}

}
