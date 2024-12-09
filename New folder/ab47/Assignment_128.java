package ab47;

public class Assignment_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*StringBuilder fog=new StringBuilder ("Ankita");
      fog.append(" Dilip Deokar");
      System.out.println(fog);*/
		
		StringBuffer fog=new StringBuffer ("Life");
	      fog.append(" is a unpreditable");
	      System.out.println(fog);
	      
	      fog.insert(0, "Yes, ");
	      System.out.println(fog);
	      
	      fog.replace(15,27, "good & nice");
	      System.out.println(fog);
	      
	      fog.delete(19,27);
	      System.out.println(fog);
	      
	      fog.reverse ();
	      System.out.println(fog);
	      
	}

}
