package assignment2;

public class ConvertString2char {

	public static void main(String[] args) {
		String s = "string";
		
		//convert string to char:
		
		char[] c = s.toCharArray();
        for (int i=0; i<c.length; i++){
            System.out.println("String to char  :"+c[i]);
        }
        System.out.println();
        //convert char to string:
        char mc = '2';
        String cs = Character.toString(mc);
        System.out.println("char to string :"+cs);
	}

}
