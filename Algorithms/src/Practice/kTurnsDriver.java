package Practice;

import java.util.Scanner;

public class kTurnsDriver {
	public static void main(String[] args){
		
		/*int size_x  = 3;
		int size_y = 3;
		
		int[][] matrix = new int[size_x][size_y];
		int output = getPaths(matrix, size_x-1, size_y-1);
		System.out.println(output);
		*/
		
		  Scanner in = new Scanner(System.in);
	        int res;
	        
	        String n = in.nextLine();
	        String[] n_split = n.split(" ");
	        
	        int _a_size = Integer.parseInt(n_split[0]);
	        int _k = Integer.parseInt(n_split[1]);
	        
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = pairs(_a,_k);
	        System.out.println(res);
		
	}
	
	public static int getPaths(int[][] m, int i, int j){
		if(i<0 || j<0) return 0;
		
		else return getPaths(m, i-1,j) + getPaths(m, i, j-1) + 1;
	}
	
	  static int pairs(int[] a,int k) {
	      /* Complete this function */
	        return 0;
	    }
}


