/**
* @author: Dayan Diego Sánchez Reséndiz
* @author: Lucia Guadalupe Rodriguez
* @author: Gustavo Javier Antonio Gandara
* @author: Christian Antonio Guerrero Hernández
*/

import java.io.*;
class Simplex{ 
	public static void main(String args[]) throws IOException{
		//Menu
		String menu[] = {"\tSIMPLEX METHOD","Enter mathematical model","Create matrix","About","Exit"};

		//Declare variables for matrix
		int rows=0, colums=0, data;
		int matrix [][];
		int model[][];
		int opc=0;
		model = new int[rows][rows+1];
		matrix = new int[rows+1][colums+rows+1];

		do{
			opc=0;

			//Print menu
			EnterData.printMenu(menu);
			while(opc <= 0 || opc > menu.length - 1){
				opc = EnterData.readInt("\nSelect an option: ");
			}
			switch(opc){
				case 1:
				rows = EnterData.readInt("Variables: ");
				model = new int[rows][rows+1];
				for(int i=0; i<rows; i++){
					System.out.println("Equation: "+ (i+1));
					for(int j=0; j<=rows; j++){
						if(j== rows){
							System.out.print("Result "+ (i+1)+":\t");
						}
						else{
							System.out.print("X"+ (j+1)+":\t");
						}
						model[i][j] = EnterData.readInt("");
					}
				}
				
				mathematicalModel.printMatrix(rows,model);
					
				break;
				case 2:
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
					Matrix.printMatrix2(rows, colums, matrix);
				break;
				case 3:
					Information.Infromation();
				break;
			}
		}while (opc != menu.length - 1);
		
		
	}
}