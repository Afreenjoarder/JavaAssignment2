package assignment2;

public class PalindromeEasyExample {

	public static void main(String[] args) {
		String s="madam";
		StringBuffer sb= new StringBuffer(s);
		String s2=sb.reverse().toString();
		System.out.println("String value :"+sb);
		
		//Palindrome formula:
		
		if(s.equals(s2)) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not a Palindrome");
		}
		

	}

}
