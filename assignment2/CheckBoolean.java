package assignment2;

import java.util.Arrays;

public class CheckBoolean {

	public static void main(String[] args) {
	
boolean[] a=new boolean[] {true,false,true};
boolean[] a1=new boolean[] {true,false,true};

//Display array a
System.out.print("Array a is:  ");

for(int i=0;i<a.length; i++) {
	System.out.print(" "+a[i]);
}

System.out.println("");

//Display array a1
System.out.print("Array a1 is: ");



for(int j=0;j<a1.length; j++) {
	System.out.print(" " +a1[j]);
}
System.out.println("");

//compare two boolean array
boolean results= Arrays.equals(a, a1);
if (results) {
	System.out.println("Both the arrays are  equal");
}else {
	System.out.println("Both the arrays are not equal");
}
	
	
	
	}
	
}
