package assignment2;
import java.util.Arrays;

public class StringAnagramExample {

	public static void main(String[] args) {
		String str1="Race";
	    String str2="Care";

	    boolean status = true; 
	    
	  //Comparing the length of the two strings if the lengths are not equal then strings cannot be anagrams
	    
	    if (str1.length() != str2.length()) {
	    	
	    	
	      System.out.println("Given strings are not anagram.");
	    }else {
	    	char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();
            
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2); 
            status = Arrays.equals(ArrayS1, ArrayS2); 
             
	    }
	    
	 
		
	   //Comparing the sorted arrays, if equal anagram else not anagram
	    
	    if (status) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
	      
	 
	}

}
