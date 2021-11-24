/**
* @author: Dayan Diego Sánchez Reséndiz
* @author: Lucia Guadalupe Rodriguez
* @author: Gustavo Javier Antonio Gandara
* @author: Christian Antonio Guerrero Hernández
*/

import java.io.*;
class Simplex{ 
	public static void main(String args[]) throws IOException{

		//Declare variables for matrix
		int rows, colums, data;
		int matrix [][];

		//Ask the number of columns and rows
		rows = EnterData.readInt("Variables: ");
		colums = EnterData.readInt("Restrictions: ");
		matrix = new int[rows+1][colums+rows+1];

		//Enter the values of the matrix
		for(int i=0; i<(rows+1); i++){
			System.out.print("Enter data in row " + (i+1) + "\n");
			for(int j=0; j<(colums+rows+1); j++){
				data = EnterData.readInt("matrix ["+i+"]["+j+"]: ");
				matrix[i][j]= data;
			}
		}

		System.out.print("\n\n");
		//Print matrix with the class Mtarix
		Matrix.printMatrix(rows, colums, matrix);
		
	}
}