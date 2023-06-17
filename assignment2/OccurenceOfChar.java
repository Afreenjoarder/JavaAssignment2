package assignment2;


public class OccurenceOfChar {

	public static void main(String[] args) {
		
		String s = "abracadabra-banana";
		System.out.println("String is  :"+s);
		
	//counting occurrence:
		int count = s.length() - s.replace("a", "").length();
		System.out.println("occurrence of a: "+count);
		
	}

}
