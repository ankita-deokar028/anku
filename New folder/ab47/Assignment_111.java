package ab47;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;

	public class Assignment_111 {
		public static void main(String[] args) {
			  List c2  = new ArrayList();
			   c2.add("KERLA");
		       c2.add("MANALI");
		       c2.add("GOA");
		       c2.add("THAILAND");
		       c2.add("USA");
		       c2.add("DUBAI");
	       Iterator iK= c2.iterator();
	       while(iK.hasNext()) {
	    	   
	    	   System.out.println(iK.next());
	       }  
	       System.out.println("-----------"); 
	         
	                 ListIterator ll = c2.listIterator() ; 
	                 
	                 while(ll.hasNext()) {
	                	 
	                	 System.out.println(ll.next());
	                }
	                 
	                 System.out.println("-----------"); 
	                 
	                 while(ll.hasPrevious()) {
	                	 
	                	 System.out.println(ll.previous());
	                 }               
		}

	}
