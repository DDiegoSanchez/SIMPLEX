/**
* @author: Dayan Diego Sánchez Reséndiz
* @author: Lucia Guadalupe Rodriguez
* @author: Gustavo Javier Antonio Gandara
* @author: Christian Antonio Guerrero Hernández
*/

//Class to print the array
public class Matrix {

    public static void printMatrix2(int colums,int rows,int matrix[][]){
		//Print slack variables
        System.out.print("SV");
        //Print variables X
        for(int j=0; j<(colums+rows+1); j++){
            if(j<(colums)){
                System.out.print("\tX" + (j+1));
           }
       }

       //Print restrictions S
       for(int j=0; j<(colums+rows+1); j++){
            if(j<(rows)){
                System.out.print("\tS" + (j+1));
            }
        }

        //Result column
        System.out.print("\tResult");
        System.out.print("\n");
		int ecu[][] = new int[rows][rows];
		int vector[] = new int [rows];
		for(int i=0; i<rows; i++){
            
			for(int j=0; j<rows; j++){
				ecu[i][j] = matrix[i][j];
			}
		}

		for(int i=0; i<rows; i++){
			for(int j=0; j<=rows; j++){
				if (j==rows){
					vector[i] = matrix[i][j];
				}
			}
		}
				
		for (int i = 0; i < matrix.length; i++) { 
		System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t"+matrix[i][j]+" ");
            }
			System.out.print("\n");
		}


        //Identify input column
        int less=matrix[rows][colums];
        int column=0;
        for(int j=0;j<matrix[matrix.length-1].length;j++) {
            if(matrix[matrix.length-1][j] < less){
                less = matrix[matrix.length-1][j];
                column = j;
            }
        }
        System.out.print("\n");

        System.out.print("\nThe lower value is: "+ less);
        System.out.print("\nThe input column is: "+ column);
        System.out.print("\n"); 
        
        //Print input column
        /*for(int i=0; i<matrix.length; i++){
            double div = matrix[i][column] / vector[i];
            System.out.print("\n" +  div);
        }*/
    } 
}
