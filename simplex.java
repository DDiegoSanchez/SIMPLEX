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
		String menu[] = {"\tSIMPLEX METHOD","Enter mathematical model","Create matrix","User manual","About","Exit"};

		//Declare variables for matrix
		int rows=0, colums=0, data;
		int matrix [][];
		int model[][];
		int opc=0;
		model = new int[rows][rows+1];

		do{
			opc=0;

			//Print menu
			EnterData.printMenu(menu);
			while(opc <= 0 || opc > menu.length - 1){
				opc = EnterData.readInt("\nSelect an option: ");
			}
			switch(opc){
				case 1:
				//number of variables of the mathematical model
				rows = EnterData.readInt("Variables: ");
				model = new int[rows][rows+1];
				System.out.print("\n");

				//Enter values of equations
				for(int i=0; i<rows; i++){
					System.out.println("Equation: "+ (i+1));
					for(int j=0; j<=rows; j++){
						if(j== rows){

							//Data of variables result
							System.out.print("Result "+ (i+1)+": ");
						}
						else{

							//Data of variables X
							System.out.print("X"+ (j+1)+":\t  ");
						}

						//Enter data
						model[i][j] = EnterData.readInt("");
					}
					System.out.print("\n");
				}
				
				//Print mathematical model
				mathematicalModel.printMatrix(rows,model);
					
				break;
				case 2:
					//Ask the number of columns and rows
					rows = EnterData.readInt("Variables: ");
					colums = EnterData.readInt("Restrictions: ");
					matrix = new int[rows+1][colums+rows+1];
					
					//Enter the values of the matrix
					System.out.print("Enter datas for rows\n");
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
				break;
				case 3:
					//Print user manual
					Information.userManual();
				break;
				case 4:
					//Print information about 
					Information.Infromation();
				break;
			}
		}while (opc != menu.length - 1);
	}
}