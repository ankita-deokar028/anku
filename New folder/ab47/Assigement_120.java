package ab47;
import java.util.HashMap;
import java.util.Map;
public class Assigement_120 {
	 public static void main(String[] args) {
	        Map<Object, Object> map = new HashMap<>();
	        map.put("name", "Alice");
	        map.put("city", "New York");
	        map.put("job", "Engineer");   
	        map.put("address", "Mumbai");
	        map.put("Bff", "Sneha"); 
	        System.out.println("Map 1: " + map);
	        
	        Map<Object, Object> map1 = new HashMap<>();
	        map1.put("rollno1", 12);
	        map1.put("rollno2", 24);
	        map1.put("rollno3", 56);   
	        map1.put("rollno4", 76);
	        map1.put("rollno5", 78);
	        
	        System.out.println("Map 2: " + map1);
	        
	        boolean b1 = map.equals(map1);//Assignment 122
	        System.out.println(b1);
	        /*map1.putAll(map);
	        System.out.println("Updated map: " + map1);
	        map1.putIfAbsent("rollno3", 56); //Assignment 121
	        System.out.println("Updated Value: " + map1);*/
	        
	        
	    }
	}


