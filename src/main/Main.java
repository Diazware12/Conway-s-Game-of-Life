package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
//		System.out.println("hello world");
		printMatrix(9,6);
	}
	
	public static void printMatrix (int row, int col) {
		Integer[][] grid = new Integer[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = (int)Math.round(Math.random());
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}


}
