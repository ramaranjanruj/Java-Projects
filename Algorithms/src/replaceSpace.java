
public class replaceSpace {
	public static void main(String[] args){
		
		String a = "Ramaranjan Ruj is in Texas A&M University";
		char[] str = a.toCharArray();
		
		
		

		Replace replace = new Replace();
		String output = replace.doReplace(a);
		
		System.out.println(output);

	}

}


class Replace{
	public String doReplace(String input){
		
		int length = input.length();
		char[] str = input.toCharArray();
		int spaces = 0;
		
		// Find the number of spaces
		for(int i=0; i<length; i++)
			if(str[i] == ' ') spaces++;
			
		// Calculate new length of the array
		int newLength = length + spaces*2;
		char[] strnew = new char[newLength];
		
		//Insert the string %20 from a backward scan
		for(int i = length - 1; i>=0; i--){
			if(str[i] == ' '){
				strnew[newLength - 1] = '0';
				strnew[newLength - 2] = '2';
				strnew[newLength - 3] = '%';
				newLength = newLength - 3;
			}
			else{
				strnew[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		return new String(strnew);

	}
}


