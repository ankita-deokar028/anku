package ab47;

import java.util.ArrayList;
import java.util.List;

public class Assignment_110 {

	public static void main(String[] args) {

	List c2	= new ArrayList();
	
	   c2.add("SuperMan");
       c2.add("tomjerry");
       c2.add("Blankamgic");
       c2.add("SUPERHERO");
       c2.add("NOBITA");
       c2.add("BATMAN");
       
       System.out.println(c2);
	
		List c3= new ArrayList();
		
		 c3.addAll(c2);
         System.out.println(c3);
         
         c3.clear();
         System.out.println(c3);
       System.out.println(c2.contains(c3));
    System.out.println(c2.containsAll(c3));
    System.out.println(c2.isEmpty());
    System.out.println(c2.equals("BATMAN"));
    c2.remove("Flash");
    System.out.println(c2);
   int ss =c2.size();
    System.out.println(ss);
	}
}