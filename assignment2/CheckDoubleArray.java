package assignment2;

import java.util.Arrays;

public class CheckDoubleArray {

	public static void main(String[] args) {

		double[] b=new double[] {1.5,1.25,1.00,2.5};
		double[] b1=new double[] {1.5,2.00,2.5,2.80};
		
		// Display array b
		System.out.print("Array b is:  ");
		
		for(int i=0;i<b.length; i++) {
			System.out.print(" "+b[i]);
		}

		System.out.println("");
		
		
		// Display array b1
		System.out.print("Array b1 is: ");

		for(int j=0;j<b1.length; j++) {
			System.out.print(" " +b1[j]);
		}
		System.out.println("");
		
		
	//comparing both arrays:
		
		if (Arrays.equals(b, b1))
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");
	
	
	
	}

}
