package matrix;

public class Matrix {
	
	private int row;
	private int col;
	
	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	private Integer[][] grid;	
	
	public Integer[][] getGrid() {
		return grid;
	}

	public void initialMatrix () {
		
		this.grid = new Integer[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				this.grid[i][j] = (int)Math.round(Math.random());
			}
		}
		
	}
	
	public void printMatrix() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (this.grid[i][j] == 0) {
					System.out.print(". ");
				} else {
					System.out.print("* ");
				}
//				System.out.print(this.grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void nextMatrix () {
		
		Integer[][] nextMatrix = new Integer[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				if (i == 0 || i == col - 1 || j == 0 || j == row - 1 ) {
					nextMatrix[i][j] = this.grid[i][j]; 
				} else {

					int neightbour = checkNeighbour(this.grid,i,j);
					
					int currLocation = this.grid[i][j];
					
					if (currLocation == 0 && neightbour == 3) {
						nextMatrix[i][j] = 1;
					} else if (currLocation == 1 && (neightbour < 2 || neightbour > 3)) {
						nextMatrix[i][j] = 0;
					} else {
						nextMatrix[i][j] = currLocation;
					}
				}
			}
		}
		this.grid = nextMatrix;
	}
	
	public int checkNeighbour(Integer[][] matrix, int x, int y) {
		int sum = 0;
		
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				sum += matrix[x + i][y + j];
			}
		}
		
		int currLocation = matrix[x][y];
		sum -= currLocation;
		
		return sum;
	}

}
