package ab47;//Assignment_106 and Assignment_107,108
	import java.util.ArrayList;
	import java.util.Collection;

	public class Assignment_106 {

		public static void main(String[] args) {

			
			 Collection c1  = new ArrayList();
	         
			   c1.add("Ankita");
	           c1.add("Joy");
	           c1.add("Shiv Deokar");
	           c1.add(null);
	           c1.add(null);
	           c1.add("Mangal");
	           c1.add(56.9);
	           c1.add(true);
	           c1.add(2);
	           c1.add('S');
	         
	        // c1.remove("Mangal");
	        System.out.println(c1);
	         
			
			// c1.removeAll(c1); 
			// System.out.println(c1);;
			
			
			 int ac=c1.size(); 
			 System.out.println(ac);
			 
	          
	         
			
		}

	
}
