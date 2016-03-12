
public class compressString {
	public static void main(String[] args){
		
		String a = "aaabbbbbbcddaaaaaaadd";
		Compress compress = new Compress();
		System.out.println(compress.doCompress(a));
	}
}


class Compress{
	public String doCompress(String a){
		
		char[] input = a.toCharArray();
		String output = "";
		int length = a.length();
		int count = 1;

		for(int i=0; i<length-1; i++){
			if(input[i] == input[i+1]){
				count++;
			}
			else{
				output = output.concat(Character.toString(input[i]));
				output = output.concat(Integer.toString(count));
				count = 1;
			}	
		}
		System.out.println(x);
		return output;
	}
}