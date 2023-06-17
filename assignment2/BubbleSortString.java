package assignment2;

public class BubbleSortString {

	public static void main(String[] args) {
		String[] s = { "Ava", "Steev", "Rita", "Bublee", "Nita"};
		String s1;
		
		System.out.println("Sorting String using the Bubble Sort:");
		
		//sorting
		
		for (int j = 0; j < s.length; j++) {
		   	   for (int i = j + 1; i < s.length; i++) {
				// comparing adjacent strings
				if (s[i].compareTo(s[j]) < 0) {
					s1 = s[j];
					s[j] = s[i];
					s[i] = s1;
				}
			   }
			   System.out.println(s[j]);
			}

	}

}
