package assignment2;

import java.util.Arrays;

public class CheckCharArray {

	public static void main(String[] args) {

		char[] c= new char[] {'P','Q','A'};
		char[] c1= new char[] {'P','Q','A'};
		
		// Display array c
				System.out.print("Array c is:  ");
				
				for(int i=0;i<c.length; i++) {
					System.out.print(" "+c[i]);
	 			}

				System.out.println("");
				
				
				// Display array c1
				System.out.print("Array c1 is: ");

				for(int j=0;j<c1.length; j++) {
					System.out.print(" " +c1[j]);
				}
				System.out.println("");
				
		//comparing both Arrays:
		if (Arrays.equals(c, c1))
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");
		
		
	}

}
