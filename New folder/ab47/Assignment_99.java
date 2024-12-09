package ab47;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment_99 {
	public static void main(String[] args) {

        Collection c1  = new ArrayList();
        c1.add("cat");
        c1.add("dog");
        c1.add("horse");
        c1.add("lion");
        c1.add("elephant");
       
        
        System.out.println(c1);
        
      Collection c2  = new ArrayList();
      
     c2.addAll(c1);
      
      System.out.println(c2);
      
    //  c2.clear();
   // System.out.println(c2);
      
   // System.out.println(c2.isEmpty());
    
   boolean bb= c2.contains("dog");
   System.out.println(bb);
   
  		
	}
}
