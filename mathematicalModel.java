public class mathematicalModel {
   public static void printMatrix(int rows,int model[][]){
				
		int ecu[][] = new int[rows][rows];
		int vector[] = new int [rows];
		//Print variables X
        for(int j=0; j<(rows+1); j++){
            if(j<(rows)){
                System.out.print("\tX" + (j+1));
           }
		}

		 //Result column
		 System.out.print("\tResult");
		 System.out.print("\n");

		 //Create matrix of variables
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				ecu[i][j] = model[i][j];
			}
		}

		//Create vector of result column
		for(int i=0; i<rows; i++){
			for(int j=0; j<=rows; j++){
				if (j==rows){
					vector[i] = model[i][j];
				}
			}
		}
				
		//Print matrix
		for (int i = 0; i < model.length; i++) { 
		System.out.println();
            for (int j = 0; j < model[i].length; j++) {
                System.out.print("\t"+model[i][j]);
            }
			System.out.println("\n");
		}
    }
}
