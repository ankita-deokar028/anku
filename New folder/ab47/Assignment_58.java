package ab47;


	class Google_AUth {
	    
	    public void login() {
	        System.out.println("Login with mobile number");
	    }
	}

	class Method_overridiing extends Google_AUth {
	   
	    public void login() {
	        
	        super.login();
	        System.out.println("Login with email address");
	    }
	}

	public class Assignment_58 {
	    public static void main(String[] args) {
	        
	    	Method_overridiing m1 = new Method_overridiing();

	        m1.login();
	    }
	}

