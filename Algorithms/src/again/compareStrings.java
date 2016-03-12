//import java.util.*;
//import java.io.*;

package again;

import java.util.Scanner;

public class compareStrings {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		Compare compare = new Compare();
		System.out.println(a.length() + b.length());
		String output = compare.doComparision(a, b);
		System.out.println(output);
		
		String a1 = a.substring(0, 1).toUpperCase() + a.substring(1);
		String b1 = b.substring(0, 1).toUpperCase() + b.substring(1);
		
		System.out.printf("%s %s", a1, b1);
		sc.close();
	}
}

class Compare{
	
	public String doComparision(String a, String b){
		if(a.compareTo(b) > 0) return "No";
		else return "Yes";
	}
}
