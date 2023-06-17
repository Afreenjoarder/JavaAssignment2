package assignment2;

public class ExampleSplit {

	public static void main(String[] args) {
		String s= "Java-Language";
		System.out.println("s value  :"+s);
		
		// String.split() formula:
		
		String[] s2= s.split("-");
		for(String x:s2) {
			System.out.println("Split Result  :"+x);
			
		}
		

	}

}
