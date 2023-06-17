package assignment2;

import java.util.Arrays;

public class CheckShortArrays {

	public static void main(String[] args) {
		 short[] s1 = new short[]{107,93,58};
		 short[] s2 = new short[]{190,93,58};
		 
		//Display array s
			System.out.print("Array s1 is:  ");
			
			for(int i=0;i<s1.length; i++) {
				System.out.print(" "+s1[i]);
				}

			System.out.println("");
			
			
			// Display array s2
			System.out.print("Array s2 is: ");

			for(int j=0;j<s2.length; j++) {
				System.out.print(" " +s2[j]);
			}
			System.out.println("");
		 
		
//comparing
		 boolean result = Arrays.equals(s1,s2);
		    System.out.println("Are two short arrays equal ? : " + result);
	}

}
