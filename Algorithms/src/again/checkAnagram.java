package again;

import java.util.*;


public class checkAnagram {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		
		sc.close();
		
		Anagram anagram = new Anagram(input1, input2);
		boolean output = anagram.anagramChecker();
		
		System.out.println(output);
	}
}


class Anagram{
	
	String input1;
	String input2;
	
	public Anagram(String input1, String input2){
		this.input1 = input1;
		this.input2 = input2;
	}
	
	public boolean anagramChecker(){
		
		// to character array
		input1.tr
		
		char[] in1 = input1.toCharArray();
		char[] in2 = input2.toCharArray();
		
		
		//Sorted array
		Arrays.sort(in1);
		Arrays.sort(in2);
		
		//Converting back to string
		String out1 = new String(in1);
		String out2 = new String(in2);
		
		if(out1.compareTo(out2) == 0) return true;
		else return false;
		
				
	}
}


