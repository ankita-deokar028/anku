package ab47;

public class Assignment_59 {
	   
	    int number = 10;  // Global variable of type int

	    
	    public void updateNumber() {
	        
	        int number = 20;  // Local variable of type int

	        System.out.println("Local number before update: " + number);
	        System.out.println("Global number before update: " + this.number);

	
	        this.number = number;  
	        System.out.println("Global number after update using 'this': " + this.number);
	    }

	    public static void main(String[] args) {
	    
	    	Assignment_59 obj = new Assignment_59();

	        obj.updateNumber();


	        System.out.println("Global number from main after method call: " + obj.number);
	    }
	
}
