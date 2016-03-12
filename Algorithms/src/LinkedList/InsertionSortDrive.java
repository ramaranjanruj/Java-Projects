package LinkedList;

public class InsertionSortDrive {
	public static void main(String[] args){
		
		int size = 10;
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			input[i] = (int) (Math.random()*100 - 50);
		}
		
		System.out.print("Input Array: ");
		for(int a:input){
			System.out.printf("%d ",a);
		}
		System.out.println("");
		
		InsertionSort insertionsort = new InsertionSort();
		int output[] = insertionsort.sort(input);
		
		System.out.print("Input Array: ");
		for(int a:output){
			System.out.printf("%d ",a);
		}
		
	}
}


class InsertionSort{
	
	public int[] sort(int[] input){
		
		for(int i = 1; i < input.length; i++){
			for(int j=i; j > 0; j--){
				if(input[j] < input[j-1]){
					int temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}else break;
			}
		}
		return input;
	}
	
}