package ab47;
	import java.util.HashMap;
	import java.util.Map;

public class Assignment_127 {
public static void main(String[] args) {
	        
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("name", "Alice");
	        map.put("city", "New York");
	        map.put("job", "Engineer");   
	        map.put("address", "Mumbai");
	        map.put("Bff", "Sneha"); 
	        System.out.println("Map 1: " + map);
	        
	        Map<String, Integer> map1 = new HashMap<String, Integer>();
	        map1.put("rollno1", 12);
	        map1.put("rollno2", 24);
	        map1.put("rollno3", 56);   
	        map1.put("rollno4", 76); 
	        map1.put("rollno5", 78);

	        System.out.println("Map 2: " + map1);
	      
	        map1.clear();
	        System.out.println("Map 2 after clear(): " + map1); 

	        System.out.println("Is Map 2 empty? " + map1.isEmpty()); 

	        System.out.println("Is Map 1 empty? " + map.isEmpty()); 

	        map.clear();
	        System.out.println("Map 1 after clear(): " + map); 
	        System.out.println("Is Map 1 empty after clear()? " + map.isEmpty());
	    }
	
}
