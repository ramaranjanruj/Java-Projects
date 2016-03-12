
public class rotate90 {
	public static void main(String[] args){
		
		// Size of the matrix
		int size = 10;
		int matrix[][] = new int[size][size];
		int data = 0;
		
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				matrix[rows][cols] = data;
				data++;
			}
		}
		
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				System.out.printf("%s ", matrix[rows][cols]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// Flipping upside down
		for(int rows = 0; rows < size/2; rows++){
			for(int cols = 0; cols < size; cols++){
				int temp = matrix[rows][cols];
				matrix[rows][cols] = matrix[size - rows - 1][cols];
				matrix[size - rows - 1][cols] = temp;
			}
		}
		
		// Flipping at 45 degrees diagonal
		for(int rows = 0; rows < size; rows++){
			for(int cols = 0; cols < rows; cols++){
				int temp = matrix[rows][cols];
				matrix[rows][cols] = matrix[cols][rows];
				matrix[cols][rows] = temp;
			}
		}
		
		// Printing the output matrix
		for(int rows = 0; rows<size; rows++){
			for(int cols = 0; cols < size; cols++){
				System.out.printf("%s ", matrix[rows][cols]);
			}
			System.out.println("");
		}

	}
}
