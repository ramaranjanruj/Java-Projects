package LinkedList;

public class ShellSort {
	
	// The main method
	public static void main(String[] args){
		
		int size = 15;
		int[] input = new int[size];
		
		for(int i=0; i<size; i++){
			input[i] = (int) (Math.random()*100 - 50);
		}
		
		System.out.print("Unordered Array:  ");
		for(int a: input){
			System.out.printf("%d ", a);
		}
		
		ShellSort shellsort = new ShellSort();
		int[] output = shellsort.sort(input);
		
		System.out.println("");
		System.out.print("Ordered Array:  ");
		for(int a: output){
			System.out.printf("%d ", a);
		}
		
	}

	
	
	// the sort method 
	public int[] sort(int[] input){
		
		
		int h = 0;
		int N = input.length;
		
		while(h<N/3) h=3*h+1;  // for a 3X+1 shellsorting
		
		while(h>=1){
			for(int i=h; i<N; i++){
				for(int j=i; j >=h; j=j-h){
					if(input[j] < input[j-h]) exch(input, j, j-h);
					else break;
				}
				
			}
			h = h/3;
		}	
		return input;
	}


public static void exch(int[] obj, int a, int b){
	int temp = obj[a];
	obj[a] = obj[b];
	obj[b] = temp;
}
}