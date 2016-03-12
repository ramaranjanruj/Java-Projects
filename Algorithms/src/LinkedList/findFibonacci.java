package LinkedList;

public class findFibonacci {
	public static void main(String[] args){
		
		findFibonacci fibo = new findFibonacci();
		
		int number = 47;
		
		System.out.println(fibo.fibonacci(number));
	}
	
	int[] sequence = new int[256];
		public int fibonacci(int i){
			if (i == 0) return 1;
			if (i == 1) return 1;
			if (sequence[i] != 0) return sequence[i];
			sequence[i] =  fibonacci(i-1) + fibonacci(i -2);
			return sequence[i];
			//return fibonacci(i-1) + fibonacci(i -2);
		}
	}


