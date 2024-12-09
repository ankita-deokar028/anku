package ab47;

public class Assignment_24 {
	static void add()
	 {
		 System.out.println("1");
	 }
	static void add(int a)
	 {
		 System.out.println("2");
	 }
	static void add(Boolean a)
	 {
		 System.out.println("3");
	 }
	static void add(int a,double b)
	 {
		 System.out.println("4");
	 }
	static void add(char a)
	 {
		 System.out.println("5");
	 }
	void add(double a)
	 {
		 System.out.println("A");
	 }
	void add(String a)
	 {
		 System.out.println("B");
	 }
	void add(double c, int d)
	 {
		 System.out.println("C");
	 }
	void add(String d, char a)
	 {
		 System.out.println("D");
	 }
	void add(long  d)
	 {
		 System.out.println("E");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   add();
   add(44);
   add(true);
   add(10,122.60);
   add('A');
   Assignment_24 N1= new Assignment_24();
   N1.add(190.87);
   N1.add(123456789L);
   N1.add("Shiv");
   N1.add(155.80, 34);
   N1.add("Mahadev",'A');
   }

}

	