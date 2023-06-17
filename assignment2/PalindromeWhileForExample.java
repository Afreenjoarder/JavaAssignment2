package assignment2;

import java.util.Scanner;

public class PalindromeWhileForExample {

	public static void main(String[] args) {
		 String reverseString="";
		 
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a string to check if it is a palindrome:");
	     String s = sc.nextLine();
	     
	     int len=s.length();
	     /* 
	     // For loop using for Palindrome:
	     for ( int i = len - 1 ; i >= 0 ; i-- )
	         reverseString = reverseString + s.charAt(i);
	         
	         */
	     
	     // Using While loop for Palindrome:
	     int i = len-1;
	     while ( i >= 0){
	         reverseString = reverseString + s.charAt(i);
	         i--;
	     }
	     
	     if (s.equals(reverseString)) {
	         System.out.println("Input string is a palindrome.");
	     }
	      else {
	         System.out.println("Input string is not a palindrome.");
	      }
	}

}
