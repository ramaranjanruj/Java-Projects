public class MergeSort {
	public static void main(String[] args){
		
		int[] left = {1,3,5,7,9};
		int[] right = {2,4,6,8,10};
		
		Merge merge = new Merge();
		merge.sort(left, right);
	}
}



class Merge{
	
	
	public void sort(int[] a, int[]b){
		
		int N = a.length + b.length;
		int[] aux = new int[N];
		int i = 0;
		int j = 0;
		
		for(int k=0; k<N; k++){
			
			if(i >= a.length) aux[k] = b[j++];
			else if(j >= b.length) aux[k] = a[i++];
			else if(a[i] > b[j]) aux[k] = b[j++];
			else aux[k] = a[i++];
		}
		
		System.out.println();
		for(int element:aux){
			System.out.printf("%d ", element);
		}
	}
}