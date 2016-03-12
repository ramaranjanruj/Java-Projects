package again;

public class reverseString {
	public static void main(String[] args){
		
		String input = "Ramaranjan Ruj";
		String output = getReverse(input);
		
		System.out.println(output);		
	}
	
	public static String getReverse(String s){
		if(s == null || s.length() == 1){
			return s;
		}
		return getReverse(s.substring(1)) + s.charAt(0);
	}
}
