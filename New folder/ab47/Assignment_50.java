package ab47;

	class BOOK {
	    public static void staticMethod() {
	        System.out.println("This is a static method in the BOOK class.");
	    }

	    public void nonStaticMethod() {
	        System.out.println("This is a non-static method in the BOOK class.");
	    }
	}
	class Pen extends BOOK {
	    public void PenMethod() {
	        System.out.println("This is a non-static method in the PEN class.");
	    }
	}

	public class Assignment_50 {
	    public static void main(String[] args) {
	        
	    	BOOK.staticMethod();  
	    	Pen P2 = new Pen();
            P2.nonStaticMethod();  
	        P2.PenMethod(); 

	    }
	}
	
	    