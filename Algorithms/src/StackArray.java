/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

public class StackArray {

	private String[] Stack;
	private int n=0;

	public StackArray(int capacity){
		Stack = new String[capacity];
	}

	public boolean isEmpty(){
		return n==0;
	}

	public void addStack(String word){
		Stack[n++] = word;
	}

	public String removeStack(){
		return Stack[--n];
	}

	public void readMe(String[] list){
		for(String i:list){
			System.out.printf("%s ", i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackArray a = new StackArray(10);
		a.isEmpty();
		a.readMe(a.Stack);
		a.addStack("Ramaranjan");
		a.readMe(a.Stack);
		a.addStack("cyx*");
		a.readMe(a.Stack);
		a.addStack("Razor");
		a.readMe(a.Stack);
		a.removeStack();
		a.readMe(a.Stack);
		a.isEmpty();
		a.readMe(a.Stack);
	}

}
