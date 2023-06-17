package assignment2;

public class StringCompareTo {

	public static void main(String[] args) {
	String s1="Hello World";
	String s2="Hello World";
	System.out.println("String s1  :"+s1);
	System.out.println("String s2  :"+s2);
	
	
	//comparing strings
	if(s1.compareTo(s2)==0) {
		System.out.println("Strings are equal.");
	}else {
		System.out.println("Strings are not equal.");
	}
	

	}

}
