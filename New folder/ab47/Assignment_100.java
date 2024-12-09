package ab47;
	import java.util.ArrayList;
	import java.util.Collection;

	public class Assignment_100 {
		public static void main(String[] args) {

	           Collection c1  = new ArrayList();
	           c1.add("ANkita");
	           c1.add("Joy");
	           c1.add("Shiv Deokar");
	           c1.add(null);
	           c1.add(null);
	           c1.add("Mangal");
	           c1.add(56.9);
	           c1.add(true);
	           c1.add(2);
	           c1.add('s');
	           
	           System.out.println(c1);
	           
	         Collection c2  = new ArrayList();
	         
	        c2.addAll(c1);
	         
	         System.out.println(c2);
	         
	         c2.clear();
	      // System.out.println(c2);
	         
	       //System.out.println(c2.isEmpty());
	       
	      boolean bb= c2.contains("Tom");
	      System.out.println(bb);
	      
	     		
			           
			
			
		}

	}

