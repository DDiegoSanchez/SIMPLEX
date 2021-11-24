/**
* @author: Dayan Diego Sánchez Reséndiz
* @author: Lucia Guadalupe Rodriguez
* @author: Gustavo Javier Antonio Gandara
* @author: Christian Antonio Guerrero Hernández
*/

//Method to enter data into the matrix
import java.io.*;
class EnterData{

	private static BufferedReader read = new BufferedReader (new InputStreamReader(System.in));

	//This method accepts only integer values
	public static int readInt( String message) throws IOException {
		int number=0;
		int redFlag=0;
		while(redFlag==0){
			System.out.print(message);
			try{
					number = Integer.parseInt(read.readLine());
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