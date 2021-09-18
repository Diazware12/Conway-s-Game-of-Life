package matrix;

public class Matrix {
	
	private int row;
	private int col;
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void printMatrix () {
		Integer[][] grid = new Integer[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = (int)Math.round(Math.random());
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printNextMatrix () {
		Integer[][] grid = new Integer[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = (int)Math.round(Math.random());
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int checkNeighbour(Integer[][] grid) {
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += grid[i][j];
			}
			System.out.println();
		}
		sum -= grid[row][col];
		return sum;
	}

	public Matrix() {
		// TODO Auto-generated constructor stub
	}

}
