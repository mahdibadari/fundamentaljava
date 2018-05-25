package lambda;

public class TestRun {
	public static void main(String[] args) {
		SortingExamples test = new SortingExamples();
		for (String str:test.sortedByLengthAscending()) {
			//System.out.println(str);
		}
		for (String str:test.sortedByLengthDescending()) {
			//System.out.println(str);
		}
		for (String str:test.sortedByFirstLetter()) {
			//System.out.println(str);
		}
		for (String str:test.sortedByContains()) {
			//System.out.println(str);
		}
		String test1 = "Hello";
	    String test2 = "Goodbye";
	    
		String betterStringBasedOnLength = IsBetterExamples.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
		String betterStringBasedOn1stArgs = IsBetterExamples.betterString(test1, test2, (s1, s2) -> true);
		System.out.println(betterStringBasedOnLength +";"+betterStringBasedOn1stArgs);
		
	    int int1 = 1;
	    int int2 = 2;
	    
		String betteElementBasedOnLength = IsBetterExamples.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length());
		int betterStringBasedOn1stArgs2 = IsBetterExamples.betterElement(int1, int2, (n1, n2) -> n1 > n2);
		System.out.println(betteElementBasedOnLength +";"+betterStringBasedOn1stArgs2);
	
	}
}
