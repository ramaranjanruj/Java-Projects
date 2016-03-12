package LinkedList;

public class shortestPalindrome {
	public static void main(String[] args){
		
		String data = "banana";
		getPalindrome get = new getPalindrome(data);
		System.out.println(get.palindrome());
		
	}
}


class getPalindrome{
	
	String input = "";
	
	int cut = 0;
	
	public getPalindrome(String a){
		input = a;
	}
	
	public String palindrome(){
		
		String rev_input = new StringBuilder(input).reverse().toString();
		int len = input.length();
		
		
		for(int i = 1; i < len; i++ ){
			if(input.substring(0, i).equals(rev_input.substring(len - i, len))){
				cut = i;
			}
		}
		return rev_input.substring(0,len-cut)+ input;
	}
}
