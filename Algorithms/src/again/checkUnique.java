package again;

import java.io.*;
import java.util.*;

public class checkUnique {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		
		Unique unique = new Unique(input);
		boolean output = unique.check();
		System.out.println(output);
		//sc.close();
	}
}

class Unique{
	
	String input;
	
	public Unique(String input){
		this.input = input;
	}
	
	public boolean check(){
		int size = input.length();
		
		boolean[] checker = new boolean[256];
		
		for(int i=0; i<size; i++){
			int var = input.charAt(i);
			if(checker[var]) return false;
			else checker[var] = true;
		}
		return true;
	}
}