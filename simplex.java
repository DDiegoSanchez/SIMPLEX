/*
    @author Dayan Diego Sánchez Reséndiz
    @author Lucia Guadalupe Rodriguez
    @author Gustavo Javier Antonio Gandara
    @author Christian Antonio Guerrero Hernández
*/
import java.io.*;
class Simplex{ 
	public static void main(String args[]) throws IOException{
		//Declare variables
		int rows, colums, data;
		int matrix [][];
		rows = methods.leeInt("Variables: ");
		colums = methods.leeInt("Restrictions: ");
		matrix = new int[rows+1][colums+rows+1];
		//Enter data into matrix
		for(int i=0; i<(rows+1); i++){
			System.out.print("Enter data in row " + (i+1) + "\n");
			for(int j=0; j<(colums+rows+1); j++){
				data = methods.leeInt("matrix ["+i+"]["+j+"]: ");
				matrix[i][j]= data;
			}
		}
		System.out.print("\n\n");
		//print matrix
		methods.printMatrix(rows, colums, matrix);
		
		/*int menor=0;
		for(int i=0; i < rows; i++){
			if(rows[i] < menor){
				menor = rows[i];
			}
		}
		System.out.print("\nEl valor menor es: "+ menor);*/
		
	}
}