/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */


// This is a sorting algorithm for an insertion sort.
/* It takes an integer array as an input. The output is a sorted integer array.*/

public class InsertionAttempt {

	public static void main(String[] args) {

		int[] a = {10,4,10001,2,3,6,10,5};

		for(int i:a)
			System.out.printf("%s ", i);
		int temp;

		for(int i =1; i<a.length; i++){
			for(int j=i; j>0; j--){

				if(a[j] < a[j-1]){
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					}
				else break;
			}
		}

		System.out.println();

		for(int q:a)
		System.out.printf("%s ", q);

	}

}
