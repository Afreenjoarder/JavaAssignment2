package assignment2;

import java.util.Stack;

public class PalindromeStackExample {

	public static void main(String[] args) {
		String s="madam";
		Stack s1 = new Stack();
		
		System.out.println("String is :"+s);
		
		for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
		}
            
            //Reverse method:
            
            String reverseString = "";

            while (!s1.isEmpty()) {
                reverseString = reverseString+s1.pop();
            }
            
           
            
         //Palindrome String using Stack:
            
            if (s.equals(reverseString)) {
                System.out.println("The input String is a palindrome.");
            }
            else {
                System.out.println("The input String is not a palindrome.");
            }
            
       
            
            
        }

	}


