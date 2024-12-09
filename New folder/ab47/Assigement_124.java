package ab47;
	import java.util.HashMap;
	import java.util.Map;
    
	public class Assigement_124 {
		        
	 public static void main(String[] args) {
		  Map<String, String> map = new HashMap<String, String>();
	        map.put("name", "Alice");
	        map.put("city", "New York");
	        map.put("job", "Engineer");   
	        map.put("address", "Mumbai");
	        map.put("Bff", "Sneha"); 
	        System.out.println(map);
	        
	        Map<String, Integer> map1 = new HashMap<String, Integer>();
	        map1.put("rollno1", 12);
	        map1.put("rollno2", 24);
	        map1.put("rollno3", 56);   
	        map1.put("rollno4", 76); 
	        map1.put("rollno5", 78);
	        
	        System.out.println(map1);
	        map1.remove("rollno2");//Assignment 124
	        map1.remove("rollno3", 56);//Assignment 124
	        System.out.println(map1);
	        
	        System.out.println(map.get("Bff"));//Assignment 125
	        System.out.println(map.containsKey("job"));//Assignment 126
	        System.out.println(map.containsValue("Mumbai"));//Assignment 126
	    }
	}	      
