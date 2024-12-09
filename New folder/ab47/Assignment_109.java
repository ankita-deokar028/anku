package ab47;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

	public class Assignment_109 {

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
	           System.out.println(c1);
	           
	           Iterator il= c1.iterator();
	          // while(il.hasNext()) {
	        	   
	        	   //System.out.println(il.next());
	        	   
	        	  for(int i=0; i<=c1.size()-1; i++) {
			    	   
			    	  System.out.println(il.next());
			       }
	           }}
	
	              

