public class duplicate{
	public static void main(String[] args){
		
		String test = "Ram";
		Checker checker = new Checker();
		boolean output = checker.checkDuplicate(test);
		
		System.out.println(output);
		
	}
}


class Checker{
	public boolean checkDuplicate(String input){
		boolean output = false;
		
		if(input.length() > 256) output = true;
		
		boolean[] booArray = new boolean[256];
		
		for(int i=0; i < input.length(); i++){
			int val = input.charAt(i);
			if(booArray[val]){
				output = true;
			}
			booArray[val] = true;
		}
		
		return output;
	}
}