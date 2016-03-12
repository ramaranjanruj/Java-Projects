package Practice;

public class derangement {
	public static void main(String[] args){
		
		int num = 5;
		derangement test = new derangement();
		int answer = test.getderangements(num);
		System.out.println(answer);
		
	}
	
	public int getderangements(int a){
		
		int[] temp = new int[a+1];
		
		// base answers
		//temp[0] = 1;
		temp[1] = 0;
		temp[2] = 1;
		
		
		
		for(int i=3; i<=a; ++i){
			temp[i] = (i-1)*(temp[i-1] + temp[i-2]);
		}
		return temp[a];
	}
}
