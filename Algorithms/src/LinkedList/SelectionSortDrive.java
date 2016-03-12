package LinkedList;

public class SelectionSortDrive {
	public static void main(String[] args){
		
		int size = 10;
		int[] data = new int[size];
		
		for(int i = 0; i < size; i++){
			data[i] = (int) (Math.random()*100-50);
		}
		
		System.out.print("Unsorted Array: ");
		for(int a:data){
			System.out.printf("%d ",a);
		}
		
		int[] output;
		SelectionSort selectionsort = new SelectionSort(data);
		output = selectionsort.sort();
		
		System.out.println("");
		System.out.print("Sorted Array: ");
		for(int a:output){
			System.out.printf("%d ",a);
		}
		
		
	}
}

class SelectionSort{
	
	int[] input;
	
	public SelectionSort(int[] a){
		input = a;
	}
	
	public int[] sort(){
		for(int i=1; i < input.length; i++){
			
			int minimum = input[i];
			int index = i;
			for(int j=i; j<input.length; j++){
				if(input[j] < minimum){
					minimum = input[j];
					index = j;
				}
			}
			
			if(minimum < input[i-1]){
				int temp = input[i-1];
				input[i-1] = input[index];
				input[index] = temp;
			}
		}
		return input;
	}
	
}