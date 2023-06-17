package assignment2;

public class StringUppercaseLowercase {

	public static void main(String[] args) {
		String bname="Java Progrramming";
		System.out.println("string :"+ bname);
		
		//UpperCase formula:
		
		String upperName=bname.toUpperCase();
		System.out.println("Uppername:"+upperName );
		
		//LowerCase Formula:
		
		String lowerName=bname.toLowerCase();
		System.out.println("Uppername:"+lowerName );
		
		// string startsWith() Formula:
		
		boolean startString = bname.startsWith("Ja");
		System.out.println("Start :"+startString );
		
		// String endsWith()
		
		boolean endsString = bname.endsWith("mg");
		System.out.println("Last :"+endsString );
		
		// String.replace()  Formula:
		String s3= bname.replace("v", "g");
		System.out.println("Replace value :"+s3 );
		
		
	}
	

}
