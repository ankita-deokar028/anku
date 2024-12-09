package ab47;

import java.util.Arrays;

public class Assignment_79 {
	public static void main(String[] args) {

		String name="India";
		String name1="     India     ";
		
		
		System.out.println(name.length()); // to find the lenth of the String .lenghth()
		System.out.println(name.toLowerCase()); // tolowercase to convert lowercase
		System.out.println(name.toUpperCase()); // touppercase to convert to uppercase
		System.out.println(name1.trim()); //// trim to trip space 1st and last space
		System.out.println(name.charAt(3)); /// charAt(index) to check the cherecter at the index
		System.out.println(name.indexOf('I')); /// indexof(char)--- to cheeck the index of the char
		System.out.println(name.substring(1)); /// substring(start index)
		System.out.println(name.substring(3, 5));          //// substring(start index, end index)
		System.out.println(name.equals(name1)); //// equals
		System.out.println(name.contains(name1)); ///// contains
		System.out.println(name.equalsIgnoreCase(name1)); /// equalsIgnoreCase
		char[] cc=name.toCharArray();
		System.out.println(Arrays.toString(cc));
	}

}


