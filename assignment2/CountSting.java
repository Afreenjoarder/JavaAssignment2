package assignment2;

import java.util.Scanner;

public class CountSting {
	
	private static int countWords(String input){
	     
	        if(input == null)
	            return 1;

	    
	        String[] words = input.split("\\s+");

	      
	        return words.length;
	    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string to count number of words : ");
		String s = sc.nextLine();
		System.out.println("Total number of words in the string : "+countWords(s));
	}

}
