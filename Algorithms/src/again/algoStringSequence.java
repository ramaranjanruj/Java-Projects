package again;

public class algoStringSequence {
	public static void main(String[] args){
		
		String textString = "abcNjAhNgAhGjhfhAljhRkhgRbhjbevfhO";
		String test = "NAGARRO";
		
		Pattern pattern = new Pattern();
		String output = pattern.checkPattern(textString, test);
		
		System.out.println(output);


	}
}

class Pattern{
	public String checkPattern(String text, String test){
		char[] tester = test.toCharArray();
		
		int pattern = 0;
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == tester[pattern]){
				pattern++;
			}
			if(pattern == tester.length){
				return "In Sequence";
			}
		}
		return "Not in Sequence";
	}
}


