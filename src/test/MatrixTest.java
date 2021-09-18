package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import matrix.Matrix;

class MatrixTest {

	@Test
	void initialTest() {		
		
		Matrix obj1 = new Matrix();
		
		obj1.setRow(5);
		obj1.setCol(5);
		obj1.initialMatrix();
		Integer[][] matrixResult = obj1.getGrid();
		
		boolean result = false;
		if (obj1.getGrid() != null) {
			result = true;
		}		
		
		assertEquals(true ,result);
	}
	
	@Test
	void nextMatrixTest() {		
		
		Matrix obj1 = new Matrix();
		
		obj1.setRow(5);
		obj1.setCol(5);
		obj1.initialMatrix();
		obj1.nextMatrix();
		Integer[][] matrixResult = obj1.getGrid();
		
		boolean result = false;
		if (obj1.getGrid() != null) {
			result = true;
		}		
		
		assertEquals(true ,result);
	}
	
	@Test
	void checkNeightborTest() {		
		
		Matrix obj1 = new Matrix();
		Integer[][] matrixResult = {{0,1,1,0,1},{1,1,0,1,1},{0,0,1,0,0},{1,1,0,0,1},{1,1,0,1,0}};
		int result = obj1.checkNeighbour(matrixResult, 1, 1);
				
		assertEquals(4 ,result);
	}

}
