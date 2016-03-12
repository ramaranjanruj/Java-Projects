/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

public class checkUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefgh";

		if(check(str)) System.out.println("The string is unique");
		else System.out.println("The string is not unique");

	}

	public static boolean check(String str){

		if(str.length() > 256) return false;

		boolean[] chk_var = new boolean[256];
		for(int i = 0; i < str.length(); i++){
			int var = str.charAt(i);

			if(chk_var[var]) return false;

			chk_var[var] = true;
		}
		return true;
	}

}
