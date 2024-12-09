package ab47;

	class Parent {
	    public static void displayMessage() {
	        System.out.println("This is a static method in the Parent class.");
	    }
	}
	class Child extends Parent {
	    
	    public static void displaychildMessage() {
	        System.out.println("This is a static method in the child class.");
	    }
	}
	public class Assignment_48 {
	    public static void main(String[] args) {
	        
	    	Parent.displayMessage();
	    	Child.displaychildMessage();
	    }
	
}
