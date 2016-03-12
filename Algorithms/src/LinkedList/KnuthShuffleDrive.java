package LinkedList;

public class KnuthShuffleDrive {
	public static void main(String[] args){
		
		int size = 10;
		int[] data = new int[size];
		
		for(int i=0; i<size; i++){
			data[i] = i;
		}
		
		System.out.print("Input Array: ");
		for(int a: data){
			System.out.printf("%d ", a);
		}
		
		System.out.println("");
		
		KnuthShuffle knuthshuffle = new KnuthShuffle();
		int[] output = knuthshuffle.shuffle(data);
		
		System.out.print("Shuffled Array: ");
		for(int a: output){
			System.out.printf("%d ", a);
		}
	}
}


class KnuthShuffle{
	
	public int[] shuffle(int[] in){
		
		int N = in.length;
		for(int i=1; i<N; i++){
			int r = (int) (Math.random()*i);
			exch(in, r, i);
		}
		return in;
	}
	
	public static void exch(int[] input, int a, int b){
		int temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
}