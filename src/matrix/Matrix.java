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
	
	private Integer[][] grid = null;

	public void printMatrix () {
		this.grid = new Integer[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				this.grid[i][j] = (int)Math.round(Math.random());
				System.out.print(this.grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printNextMatrix () {
		Integer[][] nextMatrix = new Integer[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				if (i == 0 || i == col - 1 || j == 0 || j == row - 1 ) {
					nextMatrix[i][j] = this.grid[i][j]; 
				} else {
					int sum = 0;
					int neightbour = checkNeighbour(this.grid,i,j);
					
					int state = this.grid[i][j];
					
					if (state == 0 && neightbour == 3) {
						nextMatrix[i][j] = 1;
					} else if (state == 1 && (neightbour < 2 || neightbour > 3)) {
						nextMatrix[i][j] = 0;
					} else {
						nextMatrix[i][j] = state;
					}
				}
				
//				grid[i][j] = (int)Math.round(Math.random());
				System.out.print(nextMatrix[i][j] + " ");
			}
			System.out.println();
		}
		this.grid = nextMatrix;
	}
	
	public int checkNeighbour(Integer[][] grid, int x, int y) {
		int sum = 0;
		
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				sum += grid[x + i][y + j];
			}
		}
		
		sum -= grid[x][y];
		return sum;
	}

	public Matrix() {
		// TODO Auto-generated constructor stub
	}

}
