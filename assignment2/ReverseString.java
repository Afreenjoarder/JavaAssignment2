package assignment2;

public class ReverseString {

	public static void main(String[] args) {
		String s="Java";
		String revStr="";
		int len =s.length();
		StringBuffer sb = new StringBuffer("Java");
		
		System.out.println("Main String is: "+s);
		
		
		
		// Reverse string formula without buffer:
		for(int i =len-1; i>=0;i--) 
			revStr= revStr+ s.charAt(i);
		
		//print reversed string 
		System.out.println("Reverse String is: "+revStr);
		System.out.println("");
		
		//Reverse String formula using Buffer:
		sb.reverse();
		
		//print reversed string using buffer:
		
		System.out.println("Reverse String with buffer is: "+sb);
		
		

	}

}
