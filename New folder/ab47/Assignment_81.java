package ab47;

public class Assignment_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] input = {5,8,16,20,5};
		double output =0;
		double total =input.length;
		double avg =0;
		for (int i = 0; i <= input.length-1; i++) {
			output=output+input[i];
			
		}
		avg=output/total;
		System.out.println(avg);
		System.out.println(output);
	}

}
