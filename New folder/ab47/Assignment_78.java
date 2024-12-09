package ab47;

public class Assignment_78
{

	public static void main(String[] args) {
		
		int[] numbers = new int[5];

	       
        numbers[0] = 10;
        numbers[1] = 25;
        numbers[2] = 95;
        numbers[3] = 40;
        numbers[4] = 68;
        
        int num= 25;
        for (int i = 0; i <= 4; i++) {
        if (num==numbers[i])
        {
        	System.out.println("Given number " + num + " is present at index "+ i);
        }
        }
}}
