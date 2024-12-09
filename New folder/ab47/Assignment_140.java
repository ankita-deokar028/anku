package ab47;
public class Assignment_140 {
	//"Assignment 140:Write a program on encapsulation "
		private String un = "contact@grotechminds";
		private int otp = 0570;
		public int getOtp() {
			return otp;
		}
		public void setOtp(int otp) {
			this.otp = otp;
		}
		public String getUn() {
			return un;
		}
		public void setUn(String un) {
			this.un = un;
		}
		public static void main(String[] args) {
			Assignment_140 e1 = new Assignment_140();
			e1.setUn("Ankitadeokar");
			System.out.println(e1.getUn());
			e1.setOtp(1598);
			System.out.println(e1.getOtp());
		}

	}
