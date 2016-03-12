
/* This code is written  by Ramaranjan Ruj
in December'15 to practice Algorithms in Java */

// This is a Selection sort procedure implemented in Java. The input is a integer array of strings.
/* The output is a sorted array of integers using the selection sort algorithm*/

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {4,6,8,1,3,9,89,10345,34,21,45};
		for(int element:array)
			System.out.printf("%s ", element);
			System.out.println();

		for(int i=0;i<array.length;i++){
			int temmin = array[i];
			for(int j=i+1;j<array.length;j++){

				if(array[j] < temmin){
					temmin = array[j];
					int temp;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			array[i] = temmin;

		}

		for(int element:array)
			System.out.printf("%s ", element);
	}
/*
	public static int findMin(int[] nums, int startindex){
		int minindex=startindex;
		for(int i=startindex;i<nums.length;i++){
			if(nums[startindex] > nums[i]){
				minindex=i;
			}
		}

		return minindex;
	}
*/
}
