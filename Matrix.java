/**
* @author: Dayan Diego Sánchez Reséndiz
* @author: Lucia Guadalupe Rodriguez
* @author: Gustavo Javier Antonio Gandara
* @author: Christian Antonio Guerrero Hernández
*/

//Class to print the array
public class Matrix {
    public static void printMatrix(int colums, int rows,int matrix[][]){
        
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
        for(int i=0; i<(rows+1); i++){
            if(i<rows){
                System.out.print("S" + (i+1));
            }
            else{
                //Objective Function
                System.out.print("Z");
            }

            for(int j=0; j<(colums+rows+1); j++){
                System.out.print("\t" + matrix[i][j] + " ");
            }
        }

        System.out.print("\n");  
        
        //Identify input column
        int less=matrix[rows][colums];
        int column=0;
            for(int i=0; i < (rows+1); i++){
                for(int j=0; j<(colums+rows+1);j++){
                    if(matrix[i][j] < less){
                        less = matrix[i][j];
                        column = j;
                    }
                }
            }

        System.out.print("\nThe lower value is: "+ less);
        System.out.print("\nThe input column is: "+ column);
    } 
}
