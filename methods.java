import java.io.*;
class methods{
    private static BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
public static void printMatrix(int colums, int rows,int matrix[][]){
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
//class for enter data
public static int leeInt( String message) throws IOException {
       int number=0;
	   int redFlag=0;
	   while(redFlag==0){
		   System.out.print(message);
		   try{
				number = Integer.parseInt(leer.readLine());
				redFlag=1;
		   }
		   catch (Exception e){
			   System.out.print("You must enter numbers\n");
			   redFlag=0;
		   }
	   }
	return (number);      
}
}