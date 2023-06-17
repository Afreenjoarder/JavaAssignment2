package assignment2;

public class DuplicateValue {

	public static void main(String[] args) {
		
		String s= "Java Programming";
	      System.out.println("The string is defined as: " + s);
	      char[] c = s.toCharArray();
	      System.out.print("\nThe duplicate characters in the string are: ");
	      
	      //duplicate:
	      for (int i = 0; i < s.length(); i++) {
	          for (int j = i + 1; j < s.length(); j++) {
	             if (c[i] == c[j]) {
	                System.out.print(c[j] + " ");
	                break;
	             }
	          } 
	      	      
	      

	}

}
}