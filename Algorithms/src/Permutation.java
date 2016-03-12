import java.util.*;

public class Permutation {
	public static void main(String[] args){
		
		String a = "Ramaranjan";
		String b = "janRamaran";
		boolean output;
		
		if(a.length() != b.length()) output = false;
		
		output = sort(a).equals(sort(b));
		System.out.printf("%s", output);
		
	}
	
	public static String sort(String input){
		char[] in = input.toCharArray();
		Arrays.sort(in);
		return new String(in);
		
	}

}


