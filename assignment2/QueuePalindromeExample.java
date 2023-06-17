package assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindromeExample {

	public static void main(String[] args) {
		String s="xyzzyx";
		Queue qu = new LinkedList();
		System.out.println("String is :"+s);
		
		//looping
		
		for (int i = s.length()-1; i >=0; i--) {
            qu.add(s.charAt(i));
        }
            
//Reverse:
		
		String reverseString = "";

        while (!qu.isEmpty()) {
            reverseString = reverseString+qu.remove();
      
        }
        
        
   //Palindrome String using  Queue :
        
        if (s.equals(reverseString)) {
            System.out.println("The input String is a palindrome.");
        }
        else {
            System.out.println("The input String is not a palindrome.");
        }
        
   
        
	}
	

}
