package ab47;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Assigement_115 {


		public static void main(String[] args) {

	        List<String> StringList = new ArrayList<>(); 
	        StringList.add("ANkita");
	        StringList.add("shiv");
	        StringList.add("mahadev");
	        StringList.add("swami");
	        StringList.add("ganpati");
	        StringList.add("devimat");

	        System.out.println("Original List: " + StringList);

	        Collections.sort(StringList); 
	        System.out.println("Sorted List: " + StringList);
	        
	    }
	}
