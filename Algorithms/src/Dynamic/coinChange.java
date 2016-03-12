package Dynamic;

public class coinChange{
	public static void main(String[] args){
		
		int[] data = {1,2,3};
		int size = data.length;
		Change change = new Change(data);
		int output = change.getChange(size, 5);
		System.out.println(output);
	}
}

/*
class Change{
	
	int[] arr;
	
	public Change(int[] arr){
		this.arr = arr;
	}
	
	public int getChange(int m, int n){
		
		if(n == 0) return 1;
		else if(n < 0) return 0;
		else if(m<=0 && n>= 1) return 0;
		else return getChange(m-1, n) + getChange(m, n-arr[m-1]);
	}
}
*/

class Change{
	
	int[] arr;
	
	public Change(int[] arr){
		this.arr = arr;
	}
	
	public int getChange(int m, int n){
		int[][] savedArr = new int[m][n];
		
		if(n == 0) savedArr[m][n] = 1;
		else if(n < 0) savedArr[m][n] = 0;
		else if(m<=0 && n>= 1)  savedArr[m][n] = 0;
		else savedArr[m][n] = savedArr[m-1][n] + savedArr[m][n-arr[m-1]];
		return savedArr[m][n];
	}
}