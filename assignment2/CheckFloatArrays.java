package assignment2;

import java.util.Arrays;

public class CheckFloatArrays {

	public static void main(String[] args) {
float[] f=new float [] {1.4f,2.2f, 3.4f};
float[] f1 = new float[] { 4.4f, 3.3f, 5.3f };

//Display array f
		System.out.print("Array f is:  ");
		
		for(int i=0;i<f.length; i++) {
			System.out.print(" "+f[i]);
		}

		System.out.println("");
		
		
		// Display array f1
		System.out.print("Array f1 is: ");

		for(int j=0;j<f1.length; j++) {
			System.out.print(" " +f1[j]);
		}
		System.out.println("");

		//comparing both Arrays:
				if (Arrays.equals(f, f1))
		            System.out.println("Arrays are Equal");
		        else
		            System.out.println("Arrays are Not Equal");

	}

}
