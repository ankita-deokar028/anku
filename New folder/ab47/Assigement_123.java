package ab47;
	import java.util.HashMap;
	import java.util.Map;
    import java.util.Map.Entry;
	public class Assigement_123 {
		 public static void main(String[] args) {
		        
		        Map<String , Integer> map1 = new HashMap<>();
		        map1.put("rollno1", 12);
		        map1.put("rollno2", 24);
		        map1.put("rollno3", 56);   
		        map1.put("rollno4", 76);
		        map1.put("rollno5", 78);
		        
		        System.out.println(map1);
		        
		        for(String s1 :map1.keySet())
		        {
		        	System.out.println("Fetching all keys-> "+s1);
		        }
		        
		        for (Integer s2 :map1.values())
		        {
		        	System.out.println("Fetching all values-> "+s2);
		        }
		        System.out.println("Fetching keys and values pair ->");
		        for (Entry<String, Integer> s3 :map1.entrySet())
		        {
		        	System.out.println(s3);
		        }
		        
		 }

}
