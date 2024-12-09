package ab47;

public class Assignment_95 {
	public static void main(String[] args) {

		String name="Manish Kumar Tiwari";
		
	
		//System.out.println(name.replace(name, "MKT"));
		
		
		String name2= name.replaceAll("[a-z]", "");
	    String name3=name2.replaceAll(name2, "MKT");
	
	
	for(int i=0; i<=name3.length()-1;i++) {
		
		char cc=name3.charAt(i);
		System.out.println(cc);
		
	}	
	

	}

}
