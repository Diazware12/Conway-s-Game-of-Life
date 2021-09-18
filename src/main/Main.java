package main;

import java.util.Scanner; 

import matrix.Matrix;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		Matrix foo = new Matrix();
		foo.setRow(10);
		foo.setCol(10);
		foo.initialMatrix();
		foo.printMatrix();
	    System.out.print("count enter value: ");

	    int enter = scan.nextInt();  // Read user input
	    while (enter != 0) {
	    	String temp = scan.nextLine();
	    	foo.nextMatrix();
	    	foo.printMatrix();
	    	enter--;
	    }
	}

}
