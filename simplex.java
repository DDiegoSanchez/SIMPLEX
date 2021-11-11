/*
    @author Dayan Diego Sánchez Reséndiz
    @author Lucia Guadalupe Rodriguez
    @author Gustavo Javier Antonio Gandara
    @author Christian Antonio Guerrero Hernández
*/
import java.io.*;
class Simplex{ 
	public static void main(String args[]) throws IOException{
		BufferedReader leer = new BufferedReader
							(new InputStreamReader(System.in));
		//Declare variables
		int rows, colums, data;
		int matrix [][];
		System.out.print("Variables: ");
		rows = Integer.parseInt(leer.readLine());
		System.out.print("Restrictions: ");
		colums = Integer.parseInt(leer.readLine());
		matrix = new int[rows+1][colums+rows+1];
		//Enter data into matrix
		for(int i=0; i<(rows+1); i++){
			System.out.print("Enter data in row " + (i+1) + "\n");
			for(int j=0; j<(colums+rows+1); j++){
				System.out.print("matrix ["+i+"]["+j+"]: ");
				data = Integer.parseInt(leer.readLine());
				matrix[i][j]= data;
			}
		}
		System.out.print("\n\n");
		//imprimir
		System.out.print("VH");
		for(int j=0; j<(colums+rows+1); j++){
			if(j<(colums)){
				System.out.print("\tX" + (j+1));
			}
		}
		for(int j=0; j<(colums+rows+1); j++){
				if(j<(rows)){
					System.out.print("\tS" + (j+1));
				}
		}
		
		System.out.print("\tResult");
		System.out.print("\n");
	
		for(int i=0; i<(rows+1); i++){
			if(i<rows){
				System.out.print("S" + (i+1));
			}
			else{
				System.out.print("Z");
			}
			for(int j=0; j<(colums+rows+1); j++){
				System.out.print("\t" + matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}