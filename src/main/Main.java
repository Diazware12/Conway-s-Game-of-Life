package main;

import java.util.Scanner; 

import matrix.Matrix;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		Matrix foo = new Matrix();
		foo.setRow(5);
		foo.setCol(5);
		foo.printMatrix();
	    System.out.print("count enter value: ");

	    int enter = scan.nextInt();  // Read user input
	    while (enter != 0) {
	    	String temp = scan.nextLine();
	    	foo.printNextMatrix();
	    	enter--;
	    }
	}

}
