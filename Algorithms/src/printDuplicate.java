import java.util.ArrayList;

public class printDuplicate {
	public static void main(String[] args) {
		
		String input = "What are you upto man!";
		FormString formstring = new FormString(input);
		
		formstring.getDuplicates();
		formstring.printDuplicates();


	}
}

class FormString{
	
	public String data;
	public ArrayList<Character> duplicates= new ArrayList<Character>();
	
	
	public FormString(String in){
		data = in;
	}
	public void getDuplicates(){
	boolean[] booArray = new boolean[256];
	
	for(int i = 0; i < data.length(); i++){
		int val = data.charAt(i);
		if(booArray[val] && !(duplicates.contains(data.charAt(i)))){
			duplicates.add(data.charAt(i));
		}
		else booArray[val] = true;
	}
}
	
	public void printDuplicates(){
		for(Character c:duplicates){
			System.out.print(c);
		}
	}
}