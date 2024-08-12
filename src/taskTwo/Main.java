package taskTwo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [][] arr = new int[4][5];
		
		for( int i = 0; i < arr.length; i++ ) {
			for( int j = 0; j < arr[i].length; j++ ) {
				arr[i][j] = (int) ( Math.random() * 100 );
			}
		}
		
		saveArrToFile("taskTwo", arr);

	}
	
	public static void saveArrToFile( String fileName, int[][] array ) {
		File file = new File( fileName + ".txt" );
		try (PrintWriter pw = new PrintWriter( file )) {
			String text = Arrays.deepToString( array );
			pw.println( text );
		} catch( IOException e ) {
			e.printStackTrace();
		}
	}

}
