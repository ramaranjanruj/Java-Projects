/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

public class shuffleKnuth {
	public static void main(String[] args){

		int size = 10;
		int[] input = new int[size];

		for(int i=0; i<size; i++){
			input[i] = i;
		}

		Shuffle shuffle = new Shuffle();
		shuffle.knuth(input);
	}
}



class Shuffle{

	public void knuth(int[] a){

		for(int element: a){
			System.out.printf("%d ", element);
		}
		System.out.println();

		int N = a.length;

		for(int i=1; i<N; i++){
			int r = (int) (Math.random()*i);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}

		for(int element: a){
			System.out.printf("%d ", element);
		}
		System.out.println();

	}
}
