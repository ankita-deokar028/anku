package ab47;

	class Plant {
	    public void displayMessage() {
	        System.out.println("This is a Non static method in the P class.");
	    }
	}
	class tree extends Plant {
	    
	    public  void displaychildMessage() {
	        System.out.println("This is a Non static method in the C class.");
	    }
	}
	public class Assignment_49 {
	    public static void main(String[] args) {
	    	tree Pani =new tree();
	    		
	    	Pani.displayMessage();
	    	Pani.displaychildMessage();
	    }
	
}