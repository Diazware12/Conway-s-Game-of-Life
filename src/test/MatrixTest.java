package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import matrix.Matrix;

class MatrixTest {

	@Test
	void test() {		
		
		int row = 5;
		int col = 5;
		
		Integer[][] matrixTest = null;
		matrixTest = new Integer[row][col];
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixTest[i][j] = (int)Math.round(Math.random());
			}
		}
		
		Matrix obj1 = new Matrix();
		
		obj1.setRow(5);
		obj1.setCol(5);
		obj1.initialMatrix();
	}

}
