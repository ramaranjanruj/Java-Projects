package Practice;

public class pathCoins {
	public static void main(String[] args){
		int size = 2;
		int[][] matrix = new int[size][size];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 4;
		matrix[1][1] = 1;
		
		int output = paths(matrix, size-1, size-1, 4);
		System.out.println(output);
		
	}
	
	public static int paths(int[][] m, int i, int j, int k){
		if(i < 0 || j< 0) return 0;
		if(i == 0 && j == 0){
			if(k == m[i][j]) return 1;
		}
		
		return paths(m, i-1, j, k-m[i][j]) + paths(m, i, j-1, k-m[i][j]);
	}
}


