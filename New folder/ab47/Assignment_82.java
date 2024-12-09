package ab47;

	
	import java.util.Arrays;
import java.util.Scanner;

	public class Assignment_82 {
		
		public static void main(String[] args) {
		//	Scanner aa=new Scanner(System.in);
			
			 int[] array = {5, 8, 16, 20, 5};
			
			//arr[0]=aa.nextInt();
			//arr[1]=aa.nextInt();
			//arr[2]=aa.nextInt();
			//arr[3]=aa.nextInt();
			//arr[4]=aa.nextInt();
			
			int arr1[]= new int[array.length];
			
		for(int i=0,j=array.length-1;i<=array.length-1;i++,j--) {
			
			arr1[j]=array[i];
			
		}	
		System.out.println(Arrays.toString(array));
	    System.out.println(Arrays.toString(arr1));
			
		}

	}

