
public class makeZero {
	public static void main(String[] args){
		
		// Size of the matrix
		int size = 5;
		int matrix[][] = new int[size][size];
		int data = 0;
		
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				matrix[rows][cols] = data;
				data++;
			}
		}
		
		matrix[2][3] = 0;
		
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				System.out.printf("%s ", matrix[rows][cols]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		boolean[] row = new boolean[size];
		boolean[] col = new boolean[size];
		
		// Setting the row and col array to true where there is zero
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				if(matrix[rows][cols] == 0){
					row[rows] = true;
					col[cols] = true;
				}
			}
		}
		
		// Making the new matrix
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				if(row[rows] || col[cols]) matrix[rows][cols] = 0;
			}
		}
		
		// Printing out the new matrix
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				System.out.printf("%s ", matrix[rows][cols]);
			}
			System.out.println("");
		}
				
	}

}
