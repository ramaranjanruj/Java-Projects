/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

public class insertionSort {
	public static void main(String[] args){
		int size = 10;

		int[] input = new int[10];
		int[] output;

		//Creating an array of random numbers
		for(int i=0; i<size; i++){
			input[i] = (int) (Math.random()*100 - 50);
		}

		//Printing out the input array
		System.out.print("The input array is: ");
		for(int element: input){
			System.out.printf("%d ", element);
		}
		System.out.println();

		//Calling the class for insertion
		Insertion insertion = new Insertion();
		output = insertion.sort(input);

		//Printing out the output array
		System.out.print("The output aray is: ");
		for(int element:output){
			System.out.printf("%d ", element);
		}


	}
}


class Insertion{

	public int[] sort(int[] a){

		for(int i=1; i<a.length; i++){
			for(int j=0; j<i; j++){
				if(a[j] > a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;

		/*
		for(int i=1; i<a.length; i++){
			for(int j=i; j >0; j--){
				if(a[j] < a[j-1]){
					//swap
					int temp = a[j];
					a[j]  = a[j-1];
					a[j-1] = temp;
				}
				else break;
			}
		}
		return a;
		*/
	}
}
