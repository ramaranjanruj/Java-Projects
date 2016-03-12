package LinkedList;

public class MergeSortDriver {
	public static void main(String[] args){
		
		int size = 20;
		int[] input = new int[size];
		
		for(int i=0; i<size; i++){
			input[i] = (int) (Math.random()*100 - 50);
		}
		
		System.out.print("Input Array: ");
			
		for(int a:input){
			System.out.printf("%s ", a);
		}
		
		System.out.println("");
		
		MergeSort mergesort = new MergeSort(input);
		int[] output = mergesort.sort();
		
		System.out.print("Merge Array: ");
		for(int a: output){
			System.out.printf("%s ", a);
		}
	}
}

class MergeSort{
	
	int[] data;
	
	
	// Constructor for the MergeSort class
	public MergeSort(int[] in){
		data=in;
	}
	
	
	// Merge Implementation
	private static void merge(int[] data, int[] aux, int low, int high, int mid){
		
		//Copying the array elements to the auxiliary array
		for(int i=low; i<= high; i++){
			aux[i] = data[i];
		}
		
		int i=low, j=mid+1;
		
		for(int k=low; k <= high; k++){
			if (i>mid) data[k] = aux[j++];
			else if(j>high) data[k] = aux[i++];
			else if(aux[j] > aux[i]) data[k] = aux[i++];
			else data[k] = aux[j++];
		}
	}
	
	
	// Sort implementation
	private static void sort(int[] data, int[] aux, int low, int high){
		int mid = (low + high)/2;
		if(low >= high) return;
		sort(data, aux, low, mid);
		sort(data, aux, mid+1, high);
		merge(data, aux, low, high, mid);
	}
	
	
	// The method that is being called from the main
	public int[] sort(){
		int[] aux = new int[data.length];
		sort(data, aux, 0, data.length-1);
		return data;
	}
}