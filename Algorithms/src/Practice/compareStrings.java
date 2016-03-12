import java.util.*;
import java.io.*;

package Practice;

public class compareStrings {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		Compare compare = new Compare();
		String output = compare.doComparision(a, b);
		
		System.out.println(output);
		
	}
}

class Compare{
	
	public String doComparision(String a, String b){
		if(a.compareTo(b) > 0) return "okay";
		else return "not okay";
	}
}
