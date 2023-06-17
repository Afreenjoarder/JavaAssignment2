package assignment2;

public class CountVowelsC {
	
	public static void count(String str)
    {
        
        int vow = 0, con = 0;
       
        // Declaring a reference String which contains all the vowels
        String ref = "aeiouAEIOU";
       
        for (int i = 0; i < str.length(); i++) {
             
            // Check for any special characters present
           
            if ((str.charAt(i) >= 'A'
                 && str.charAt(i) <= 'Z')
                || (str.charAt(i) >= 'a'
                    && str.charAt(i) <= 'z')) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
                else
                    con++;
            }
        }
       
        // Print and display number of vowels and consonants
        // on console
        System.out.println(str);
        System.out.println("Number of Vowels = " + vow
                           + "\nNumber of Consonants = "
                           + con);
    }
 
	
	

	public static void main(String[] args) {
		
		 String str = "Java Programming";
	       
	        
	        count(str);
	    
	    
	}

}
