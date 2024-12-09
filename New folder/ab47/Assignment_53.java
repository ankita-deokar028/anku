package ab47;
	class gp11{
		gp11(int a){
			System.out.println("This is  para parent constructor");
		}
	}
	class gp21 extends gp11 {
		gp21(char cc){
			super(8);			
			{
				System.out.println("This is  para sub constructor");
			}
		}
	}

	class gp22 extends gp21{
		
		gp22(float m){
			super('j');
			System.out.println("facebook");
		}
		
	}

	class gp32 extends gp22{
		
		
		gp32(){
			super(7);
			System.out.println("whast app");
		}
	}
	public class Assignment_53 {
		public static void main(String[] args) {
			gp32 c= new gp32();
		}
	}

