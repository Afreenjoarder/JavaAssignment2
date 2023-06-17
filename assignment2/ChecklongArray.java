package assignment2;

import java.util.Arrays;

public class ChecklongArray {

	public static void main(String[] args) {
		long [] s=new long[] {456, 756, 555, 999, 678};
		long [] s1=new long[] {456, 675, 555, 999, 678};
		

//Display array s
		System.out.print("Array s is:  ");
		
		for(int i=0;i<s.length; i++) {
			System.out.print(" "+s[i]);
			}

		System.out.println("");
		
		
		// Display array s1
		System.out.print("Array s1 is: ");

		for(int j=0;j<s1.length; j++) {
			System.out.print(" " +s1[j]);
		}
		System.out.println("");
		
//comparing both Arrays:
if (Arrays.equals(s, s1))
 System.out.println("Arrays are Equal");
else
 System.out.println("Arrays are Not Equal");


	}


}

