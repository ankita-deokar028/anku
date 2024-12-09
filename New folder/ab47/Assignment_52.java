package ab47;

		 class parent{
				
				void m1() {
					System.out.println("This is parent class");
				}
			}

			class subclass1 extends parent{
				
				void m2() {
					System.out.println("This is Sub class1");
				}
			}

			public class Assignment_52 extends parent {
				
				void m3() {
					System.out.println("This is sub class2");
				}

				public static void main(String[] args) {
					
					subclass1 c1= new subclass1();
					Assignment_52 c2= new Assignment_52();
					
					c1.m1(); c1.m2();
					c2.m1(); c2.m3();
				}
			}
			
			