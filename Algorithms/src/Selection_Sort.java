/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

public class Selection_Sort{
	public static void main(String[] args){
		int[] numbers = {3,7,1,2,98,45,32,76,-1,0,0,2,0};
		for(int elements:numbers){
			System.out.printf("%d ", elements);
		}
		System.out.println();
		Selection selection = new Selection();
		selection.selsort(numbers);
	}


}


class Selection{

	public void selsort(int[] a){

		int min;
		int loc = 0;

		for(int i=0; i<a.length; i++){
			min = a[i];
			for(int j=i+1; j<a.length; j++){
				if(a[j] < min){
					min = a[j];
					loc = j;
				}
			}
				if(a[i] > min){
					int temp = a[i];
					a[i] = min;
					a[loc] = temp;
				}
			}

		for(int elements:a){
			System.out.printf("%d ", elements);

		}
		}
}
