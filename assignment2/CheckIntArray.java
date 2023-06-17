package assignment2;

import java.util.Arrays;

public class CheckIntArray {

	public static void main(String[] args) {
		int[] d=new int[] {33, 66, 12, 56, 99 };
		int[] d1=new int[] {33, 66, 12, 56, 99 };
		
		// Display array d
		System.out.print("Array d is:  ");
		
		for(int i=0;i<d.length; i++) {
			System.out.print(" "+d[i]);
			}

		System.out.println("");
		
		
		// Display array d1
		System.out.print("Array d1 is: ");

		for(int j=0;j<d1.length; j++) {
			System.out.print(" " +d1[j]);
		}
		System.out.println("");
		
//comparing both Arrays:
if (Arrays.equals(d, d1))
    System.out.println("Arrays are Equal");
else
    System.out.println("Arrays are Not Equal");
		

	}

}
