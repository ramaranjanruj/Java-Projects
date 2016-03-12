/* This code is a algorithm to sort an integer array*/
public class KnuthShuffle {

	public static void main(String[] args) {
		
		//The input array we want to shuffle
		int[] input = {6,34,92,78,3,45,195,75,98,543,7893,946};
		
		System.out.print("The input array is: ");
		for(int element:input)
			System.out.printf("%d ", element);
		System.out.println();
		
		for(int i=0;i<input.length;i++){
			//Generating a random number between 0 and i(0 included, i excluded)
			int rand = (int) (Math.random() * i);
			int temp = input[i];
			input[i] = input[rand];
			input[rand] = temp;
		}
		
		System.out.print("The shuffled array is: ");
		for(int element:input)
			System.out.printf("%d ", element);
		
	}

}
