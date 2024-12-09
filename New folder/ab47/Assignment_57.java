package ab47;

class gnt{
	
	gnt(){
		this('j');
		System.out.println("1st");
	}
	
	gnt(int a){
		
		System.out.println("2nd");
	}
	
	gnt(char cc){
		this(5);
		System.out.println("3rd");
		
	}
}

public class Assignment_57 {

	public static void main(String[] args) {

		gnt cy=new gnt();
		
	}

}