package Practice;

public class binarySearch {
	public static void main(String[] args){
		int[] data = {1,2,3,4,5,6,7,8,9};
		
		Search search = new Search(data);
		search.find(10);
	}
}

class Search{
	
	private int[] arr;
	
	public Search(int[] arr){
		this.arr = arr;
	}
	
	public void find(int n){
		int output = find(n, 0, arr.length-1);
		System.out.println("The number " + n + " is in position " + output);
	}
	
	private int find(int N, int low, int high){
		if(low>high) return -1;
		int mid = (low+high)/2;
		if(N == arr[mid]) return mid;
		else if(N > arr[mid]) return find(N, mid+1, high);
		else return find(N, 0, mid-1);	
	}
}
