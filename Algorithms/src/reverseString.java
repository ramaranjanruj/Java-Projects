
public class reverseString {
	public static void main(String[] args){
		
		String input = "Ramaranjan";
		Reverse reverse = new Reverse();
		char[] output = reverse.doReverse(input);
		
		System.out.println(output);
		
	}

}



class Reverse{
	public char[] doReverse(String input){
		
		char[] characters = input.toCharArray();
		//char[] output = new char[characters.length];
		
		for(int i=0; i<characters.length/2; i++){
			char temp = characters[i];
			characters[i] = characters[characters.length - i -1];
			characters[characters.length - i -1] = temp;
		}
		
		return characters;
	}
}