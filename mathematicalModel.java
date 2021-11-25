public class mathematicalModel {
   public static void printMatrix(int rows,int model[][]){
				
		int ecu[][] = new int[rows][rows];
		int vector[] = new int [rows];
		for(int i=0; i<rows; i++){
			for(int j=0; j<rows; j++){
				ecu[i][j] = model[i][j];
			}
		}

		for(int i=0; i<rows; i++){
			for(int j=0; j<=rows; j++){
				if (j==rows){
					vector[i] = model[i][j];
				}
			}
		}
				
		for (int i = 0; i < model.length; i++) { 
		System.out.println();
            for (int j = 0; j < model[i].length; j++) {
                System.out.print(model[i][j]);
            }
			System.out.println("\n");
		}
    }
}
