
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input;
		
		
		//Creating a new array
		int size = 10;
		input = new int[size];
		for(int i = 0; i<size; i++){
			input[i] = (int) (Math.random()*100 - 50);
		}
		
		
		//Sorting the array
		Sort sort = new Sort();
		sort.bsort(input);
				
	}

}


class Sort{
	
	public void bsort(int[] a){
	boolean cont = true;
	
	
	//Printing the input array
			for(int element:a){
				System.out.printf("%d ", element);
			}
			System.out.println();
			
			
	while(cont){
		cont = false;
		for(int i=0; i <a.length-1; i++){
			if(a[i] > a[i+1]){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				cont = true;
			}
		}
	} 
	
	//Printing out the output array
			for(int element:a){
				System.out.printf("%d ", element);
			}
			System.out.println();
	
}
}