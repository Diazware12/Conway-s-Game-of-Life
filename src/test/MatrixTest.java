package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import matrix.Matrix;

class MatrixTest {

	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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

}
