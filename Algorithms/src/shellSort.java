/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

// This is a java implementation of the shell sort algorithm
// Worst case with shell sorting is : O(N^3/2)
// Does a linearithmic compares when the array is already sorted.

public class shellSort {
	public static void main(String[]args){

		int size = 10;
		int[] input = new int[size];

		for(int i=0; i<size; i++){
			input[i] = (int) (Math.random()*100 - 49);
		}

		Sorter sort = new Sorter();
		sort.shell(input);
	}
}


class Sorter{

	public void shell(int[] a){

		for(int element:a){
			System.out.printf("%d ", element);
		}
		System.out.println();

		int N = a.length;
		int h = 1;

		while(h<N/3){ //This creates a 3x+1 sequences... 1,4,13,40...
			h=h*3 + 1;
		}

		while(h >= 1){
			//h-sort the array
			for(int i=h; i<N; i++){
				for(int j = i; j>=h && (a[j] < a[j-h]); j=j-h) //(Optimization): the (a[j] < a[j-h] takes the fact that a h sorted array will be always y sorted array (y>x)
				if(a[j] < a[j-h]){
					int temp = a[j];
					a[j] = a[j-h];
					a[j-h] = temp;
				}
			}
			h = h/3;
		}

		for(int element:a){
			System.out.printf("%d ", element);
		}

	}


}
