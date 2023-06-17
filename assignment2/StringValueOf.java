package assignment2;

public class StringValueOf {

	public static void main(String[] args) {
		
		//different type of value 
		int a=120;
		float f=12.34f;
		double d=2345.0;
		boolean b=true;

		System.out.println("After converting into string");
		
		System.out.println("String value of a: "+ String.valueOf(a));
		System.out.println("String value of f: "+ String.valueOf(f));
		System.out.println("String value of d: "+ String.valueOf(d));
		System.out.println("String value of b: "+ String.valueOf(b));
		
	}

}
