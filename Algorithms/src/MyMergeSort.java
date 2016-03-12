/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */


public class MyMergeSort {

	private int[] array;
	private int length;
	private int[] tempMergArray;

	public static void main(String[] args){

		int[] a = {4,7,5,43,89,-98,93,21,0,4};
		MyMergeSort mms = new MyMergeSort();
		mms.sort(a);

		for(int i:a){
			System.out.printf("%d ", i);
		}
		System.out.println();
	}

	public void sort (int inputArr[]){
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArray = new int[length];
		doMergeSort(0, length-1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex){
		if(lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex)/2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle + 1, higherIndex);
			mergeParts(lowerIndex, higherIndex, middle);
		}
	}

	private void mergeParts(int lowerIndex, int higherIndex, int middle){
		for(int i=lowerIndex; i<=higherIndex; i++){
			tempMergArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while(i<=middle && j <= higherIndex){
			if(tempMergArray[i] <= tempMergArray[j]){
				array[k] = tempMergArray[i];
				i++;
			}
			else{
				array[k] = tempMergArray[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
			array[k] = tempMergArray[i];
			i++;
			k++;
		}
	}
}
